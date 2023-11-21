package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.adapter.FreteAdapter;
import br.com.bomtransporte.boaminuta.client2.CargaMiliClient;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.mili.ReceberCargaResponse;
import br.com.bomtransporte.boaminuta.model.CargaFiltro;
import br.com.bomtransporte.boaminuta.model.FreteModel;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.PedidoEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IFreteRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IMunicipioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FreteService {

    @Autowired
    private CargaMiliClient articleClient;

    @Autowired
    private IFreteRepository freteRepository;
    @Autowired
    private FilialService filialService;

    @Autowired
    private FreteAdapter cargaAdapter;

    @Autowired
    private CaminhaoService caminhaoService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private IMunicipioRepository municipioRepository;

    @Autowired
    private PedidoService pedidoService;

    public FreteService(){
        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        //articleClient = annotationConfigApplicationContext.getBean(CargaClient.class);
    }

    public List<FreteModel> consultarCargas(CargaFiltro filtro) throws Exception {
        var filiais = filtro.getFiliais();
        filiais = filiais == null || filiais.isEmpty() ? filialService.getFiliaisUsuarioEntity() : filiais;

        var fretes = freteRepository.findAllByFilialIdIn(filiais.stream().map(f ->f.getId()).collect(Collectors.toList()));
        List<FreteModel> cargas = new ArrayList<>();
        for(var frete : fretes){
            cargas.add(cargaAdapter.freteEntityToModel(frete));
        }

        var cargasDisponiveis = consultarCargasDisponiveisMili(cargas, filiais);
        cargas.addAll(cargasDisponiveis);

        return aplicarFiltros(cargas, filtro);
    }

    private List<FreteModel> aplicarFiltros(List<FreteModel> cargas, CargaFiltro filtro){
        return cargas.stream().filter(c -> {
            var ok = true;
            if(filtro.getComPlaca() != null  && filtro.getComPlaca()){
                ok = ok && c.getPlaca() != null && !c.getPlaca().isEmpty();
            }
            if(filtro.getSemPlaca() != null && filtro.getSemPlaca()){
                ok = ok && (c.getPlaca() == null || c.getPlaca().isEmpty());
            }
            if(filtro.getSemPlaca() != null && filtro.getSemPlaca() && filtro.getComPlaca() != null  && filtro.getComPlaca()){
                ok = true;
            }
            if(filtro.getFaturadas() != null && filtro.getFaturadas()){
                ok = ok && c.isFaturado();
            }
            if(filtro.getDataInicioFaturamento() != null){
                ok = ok && filtro.getDataInicioFaturamento().isBefore(c.getDataLiberacaoFaturamento());
            }
            if(filtro.getDataFimFaturamento() != null){
                ok = ok && filtro.getDataFimFaturamento().isAfter(c.getDataLiberacaoFaturamento());
            }
            return ok;
        }).collect(Collectors.toList());
    }

    private List<FreteModel> consultarCargasDisponiveisMili(List<FreteModel> cargasExistentes, List<FilialEntity> filiais) throws Exception {

        filiais = filiais == null ? filialService.getFiliaisUsuarioEntity() : filialService.getTodasByIds(filiais.stream().map(f -> f.getId()).collect(Collectors.toList()));
        var cargas = new ArrayList<FreteModel>();

        for(var filial : filiais) {
            var numeroCargasExistentes = cargasExistentes.stream().map(c -> c.getNumeroCarga()).collect(Collectors.toList());
            var cargaModel = consultarCargasDisponiveisMili(numeroCargasExistentes, filial);
            cargas.addAll(cargaModel);
        }

        return cargas;
    }

    private List<FreteModel> consultarCargasDisponiveisMili(List<Long> numerosCargasExistentes, FilialEntity filial) throws Exception {
        //var request = new ConsultarCargasDisponiveis(filial.getCodigoMili(), filial.getSenha());
        var cargas = articleClient.consultarCargasDisponiveis(filial.getCodigoMili());
        var cargasModel = new ArrayList<FreteModel>();
        if(cargas == null){
            return cargasModel;
        }
        for(var carga : cargas.getOut().getCarga()) {
            var cargaDetalhe = buscarDetalheCarga(carga.getNrCarga(), filial.getCodigoMili(), filial.getSenha(), false);
            if(!numerosCargasExistentes.contains(cargaDetalhe.getNumeroCarga())){
                cargasModel.add(cargaDetalhe);
            }
        }
        return cargasModel;
    }

    public FreteModel buscarCarga(Long nroCarga, Long idFilial) throws Exception {
        var frete = freteRepository.findByNumeroCargaAndFilialId(nroCarga, idFilial);
        var filial = filialService.getById(idFilial);
        var cargaModel = frete != null ? cargaAdapter.freteEntityToModel(frete) : buscarDetalheCarga(nroCarga, filial.getCodigoMili(), filial.getSenha(), true);
        var usuarioOp = usuarioService.getUserDetails();
        var respFatModel = UsuarioModel.builder().nome(usuarioOp.getNome()).id(usuarioOp.getId()).build();

        cargaModel.setResponsavelOperacional(respFatModel);

        return cargaModel;
    }

    public FreteModel buscarDetalheCarga(Long nroCarga, Long codigoMili, String senha, boolean isArquivoObrigatorio) throws Exception {
       // var request = new ReceberCarga(codigoMili, senha, nroCarga);
        var cargaMili = articleClient.receberCarga(nroCarga, codigoMili);
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
        return cargaAdapter.receberCargaDetalheResponseToCargaModel(cargaMili, filialModel);
    }

    @Transactional
    public void salvar(FreteEntity frete) throws Exception {
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
        salvarCaminhao(frete);

        var pedidos = montarPedidos(frete);
        frete.setPedidos(pedidos);

        var usuarioOperacional = usuarioService.getById(usuarioService.getUserDetails().getId());
        frete.setResponsavelOperacional(usuarioOperacional);

        if(frete.isFaturado()){
            frete.setResponsavelFaturamento(usuarioService.getUserDetails());
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
        ReceberCargaResponse detalheCarga = articleClient.consultarDetalheCarga(filial.getCodigoMili(), frete.getNumeroCarga());

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
    }
    private void atualizar(FreteEntity frete) throws BoaMinutaBusinessException {

        salvarFaturista(frete);
        buscarEntidades(frete);
        salvarCaminhao(frete);

        if(usuarioService.getUserDetails().isFaturista()) {
            freteRepository.save(frete);
            return;
        }

        var freteAnterior = freteRepository.findById(frete.getId()).get();
        if(freteAnterior.isFaturado() && !usuarioService.getUserDetails().isAdministrador()){
            throw new BoaMinutaBusinessException("Não é possível alterar o frete");
        }
        freteRepository.save(frete);
    }

    public void salvarFaturista(FreteEntity frete){
        var freteAnterior = freteRepository.findById(frete.getId()).get();
        if( !freteAnterior.isFaturado() && frete.isFaturado()){
            frete.setResponsavelFaturamento(usuarioService.getById(usuarioService.getUserDetails().getId()));
            frete.setFaturado(true);
        }
    }

    private Double round(Double value){
        return BigDecimal.valueOf(value).setScale(2, RoundingMode.FLOOR).doubleValue();
    }

}
