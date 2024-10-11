package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.adapter.FreteAdapter;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.exception.MunicipioVazioException;
import br.com.bomtransporte.boaminuta.mili.ReceberCargaResponse;
import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.model.FreteModel;
import br.com.bomtransporte.boaminuta.model.ListarFrete;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.entity.CargasConsultadas;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.PedidoEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.*;
import br.com.bomtransporte.boaminuta.persistenceMili.entity.DetalheCargaArquivoEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FreteService {

    @Autowired
    private DetalheCargaArquivoService detalheCargaService;

    @Autowired
    private IFreteRepository freteRepository;
    @Autowired
    private FilialService filialService;

    @Autowired
    private FreteAdapter freteAdapter;

    @Autowired
    private CaminhaoService caminhaoService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private IMunicipioRepository municipioRepository;

    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private IClienteFreteRepository clienteFreteRepository;
    @Autowired
    private IItemPedidoRepository itemPedidoRepository;
    @Autowired
    private IPedidoRepository pedidoRepository;

    @Autowired
    private ICargasConsultadasRepository cargasConsultadasRepository;

    @PersistenceContext
    protected EntityManager entityManager;

    public FreteService(){

    }

    public ListarFrete consultarCargas(FreteFiltro filtro) throws Exception {
        var fretes = freteRepository.findByFiltro(filtro, entityManager);
        var qtd = freteRepository.countByFiltro(filtro, entityManager);
        fretes.forEach(f -> f.setPedidos(null));

        return new ListarFrete(qtd, fretes);
    }

    public FreteModel buscarCarga(Long nroCarga, Long idFilial) throws Exception {
        var frete = freteRepository.findByNumeroCargaAndFilialId(nroCarga, idFilial);
        var freteModel = freteAdapter.freteEntityToModel(frete);
        var usuarioOp = frete != null && frete.getResponsavelOperacional() != null ? frete.getResponsavelOperacional() : usuarioService.getUsuarioLogado();
        var respFatModel = UsuarioModel.builder().nome(usuarioOp.getNome()).id(usuarioOp.getId()).build();

        freteModel.setResponsavelOperacional(respFatModel);

        return freteModel;
    }

    public FreteModel buscarDetalheCarga(Long nroCarga, Long codigoMili, String senha, boolean isArquivoObrigatorio) throws Exception {
        var cargaMili = detalheCargaService.consultarDetalheCarga(nroCarga, codigoMili);
        var filialModel = filialService.getModelByCodigoMili(codigoMili);
        if(cargaMili == null) {
            if(isArquivoObrigatorio) {
                throw new BoaMinutaBusinessException("Não existe arquivo disponivel desta carga");
            } else {
                var cargaModel = new FreteModel();
                cargaModel.setNumeroCarga(nroCarga);
                cargaModel.setFilial(filialModel);
                return cargaModel;
            }
        }
        return freteAdapter.receberCargaDetalheResponseToCargaModel(cargaMili, filialModel);
    }

    @Transactional
    public void salvar(FreteEntity frete) throws Exception {
        var clientes = clienteFreteRepository.findByFreteId(frete.getId());
        if(frete.getDataCalculo() == null) {
            frete.setDataCalculo(LocalDateTime.now());
        }
        frete.setClientes(clientes.stream().map(c -> c.getCliente()).collect(Collectors.toSet()));
        frete.setSaldo(round(frete.getSaldo()));
        frete.setMargem(round(frete.getMargem()));
        frete.setMarkup(round(frete.getMarkup()));
        if(frete.getId() == null) {
            criarNovoFrete(frete);
        } else {
            atualizar(frete);
        }
    }

    private void criarNovoFrete(FreteEntity frete) throws Exception {
        buscarEntidades(frete);

        var pedidos = montarPedidos(frete);
        frete.setPedidos(pedidos);

        var usuarioOperacional = usuarioService.getById(usuarioService.getUsuarioLogado().getId());
        frete.setResponsavelOperacional(usuarioOperacional);

        salvarCaminhao(frete);

        if(frete.isFaturado()){
            frete.setResponsavelFaturamento(usuarioService.getUsuarioLogado());
            frete.setFaturado(true);
        }

        freteRepository.save(frete);
    }

    private void buscarEntidades(FreteEntity frete){
        frete.setFilial(filialService.getById(frete.getFilial().getId()));
        frete.setMunicipioDestino(municipioRepository.findById(frete.getMunicipioDestino().getId()).get());
        frete.setMunicipioOrigem(filialService.getById(frete.getMunicipioOrigem().getId()));
        frete.setResponsavelOperacional(usuarioService.getById(frete.getResponsavelOperacional().getId()));
    }

    private List<PedidoEntity> montarPedidos(FreteEntity frete) throws Exception {
        var filial = filialService.getById(frete.getFilial().getId());
        ReceberCargaResponse detalheCarga = detalheCargaService.consultarDetalheCarga(filial.getCodigoMili(), frete.getNumeroCarga());

        return pedidoService.montarPedidos(frete, detalheCarga);
    }

    private void salvarCaminhao(FreteEntity frete){
        if(frete.getCaminhao().getId() == null) {
            caminhaoService.salvar(frete.getCaminhao());
        } else {
            var caminhaoAtual = caminhaoService.findById(frete.getCaminhao().getId());
            caminhaoService.atualizar(caminhaoAtual, frete.getCaminhao());
            frete.setCaminhao(caminhaoAtual);
        }
        frete.setPlaca(frete.getCaminhao().getPlaca());
    }
    private void atualizar(FreteEntity frete) throws BoaMinutaBusinessException {

        salvarFaturista(frete);
        buscarEntidades(frete);
        salvarCaminhao(frete);

        if(usuarioService.getUsuarioLogadoDadosAcesso().isFaturista()) {
            freteRepository.save(frete);
            return;
        }

        var freteAnterior = freteRepository.findById(frete.getId()).get();
        if(freteAnterior.isFaturado() && !usuarioService.getUsuarioLogadoDadosAcesso().isAdministrador()){
            throw new BoaMinutaBusinessException("Não é possível alterar o frete");
        }
        freteRepository.save(frete);
    }

    public void salvarFaturista(FreteEntity frete){
        var freteAnterior = freteRepository.findById(frete.getId()).get();
        if( !freteAnterior.isFaturado() && frete.isFaturado()){
            frete.setResponsavelFaturamento(usuarioService.getById(usuarioService.getUsuarioLogado().getId()));
            frete.setFaturado(true);
        }
    }

    @Transactional
    public FreteEntity atualizarFreteView(FilialEntity filial, DetalheCargaArquivoEntity detalheCargaArquivo) throws MunicipioVazioException {
        try {
            var cargaResponse = detalheCargaService.converterWsdlToReceberCargaResponse(detalheCargaArquivo);
            var nrCarga = cargaResponse.getOut().getNrCarga();
            FreteEntity frete;
            try {
                frete =  freteRepository.findByNumeroCargaAndFilialId(nrCarga, filial.getId());
            } catch (Exception e){
                throw new Exception("Nao foi possivel consultar nrCarga " + nrCarga + " e filial "+ filial.getId() , e);
            }
            if(frete != null) {
                try {
                    freteAdapter.atualizarFreteEntity(frete, cargaResponse, filial);
                } catch (Exception e){
                    throw e;
                }
                if(isAntesJulho(frete)){
                    delete(frete);
                }
            } else {
                try {
                    frete = freteAdapter.receberCargaDetalheResponseToFreteEntity(cargaResponse, filial);
                } catch (Exception e){
                    throw e;
                }
            }
            if(isAntesJulho(frete)) {
                return null;
            }
            freteRepository.saveAndFlush(frete);

            return frete;
        } catch (MunicipioVazioException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deteleAll(){
        List<FreteEntity> all = freteRepository.findAll();
        all = all.stream().filter(f -> isAntesJulho(f)).collect(Collectors.toList());
        for(var f : all){
            delete(f);
        }
    }
    private void delete(FreteEntity frete){
        try {
            var clientes = clienteFreteRepository.findByFreteId(frete.getId());
            clienteFreteRepository.deleteAll(clientes);

            List<PedidoEntity> pedidos = pedidoRepository.findByFreteId(frete.getId());
            for(var pedido : pedidos){
                var itens = itemPedidoRepository.findByPedidoId(pedido.getId());
                itemPedidoRepository.deleteAll(itens);
                pedidoRepository.delete(pedido);
            }
            List<CargasConsultadas> cargas = cargasConsultadasRepository.findByFreteId(frete.getId());
            cargasConsultadasRepository.deleteAll(cargas);
            freteRepository.delete(frete);
            freteRepository.flush();
        }catch (Exception e){
            throw e;
        }

    }

    private boolean isAntesJulho(FreteEntity frete){
        return frete != null && frete.getDataLiberacaoFaturamento() != null && frete.getDataLiberacaoFaturamento().isBefore(LocalDateTime.of(2024, 7, 1, 0, 0));
    }

    private Double round(Double value){
        return BigDecimal.valueOf(value).setScale(2, RoundingMode.FLOOR).doubleValue();
    }

}
