package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.adapter.CargaAdapter;
import br.com.bomtransporte.boaminuta.client2.CargaMiliClient;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.mili.*;
import br.com.bomtransporte.boaminuta.model.*;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.ItemPedidoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.PedidoEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CargaService {

    @Autowired
    private CargaMiliClient articleClient;

    @Autowired
    private IFreteRepository freteRepository;
    @Autowired
    private FilialService filialService;

    @Autowired
    private CargaAdapter cargaAdapter;

    @Autowired
    private CaminhaoService caminhaoService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private IMunicipioRepository municipioRepository;

    @Autowired
    private PedidoService pedidoService;

    public CargaService(){
        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        //articleClient = annotationConfigApplicationContext.getBean(CargaClient.class);
    }

    public List<CargaModel> consultarCargas(CargaFiltro filtro) throws Exception {
        var filiais = filtro.getFiliais();
        filiais = filiais == null || filiais.isEmpty() ? filialService.getFiliaisUsuarioEntity() : filiais;
        var fretes = freteRepository.findAllByFilialIdIn(filiais.stream().map(f ->f.getId()).collect(Collectors.toList()));
        var cargas = fretes.stream().map(f -> cargaAdapter.freteEntityToModel(f)).collect(Collectors.toList());

        var cargasDisponiveis = consultarCargasDisponiveisMili(cargas, filiais);
        cargas.addAll(cargasDisponiveis);

        cargas = cargas.stream().filter(c -> {
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

        return cargas;
    }

    private List<CargaModel> consultarCargasDisponiveisMili(List<CargaModel> cargasExistentes, List<FilialEntity> filiais) throws Exception {

        filiais = filiais == null ? filialService.getFiliaisUsuarioEntity() : filialService.getTodasByIds(filiais.stream().map(f -> f.getId()).collect(Collectors.toList()));
        var cargas = new ArrayList<CargaModel>();

        for(var filial : filiais) {
            var cargaModel = consultarCargasDisponiveisMili(cargasExistentes.stream().map(c -> c.getNumeroCarga()).collect(Collectors.toList()), filial);
            cargas.addAll(cargaModel);
        }

        return cargas;
    }

    public List<CargaModel> consultarCargasDisponiveisMili(List<Long> numerosCargasExistentes, FilialEntity filial) throws Exception {
        var request = new ConsultarCargasDisponiveis(filial.getCodigoMili(), filial.getSenha());
        var cargas = articleClient.consultarCargasDisponiveis(filial.getCodigoMili());
        var cargasModel = new ArrayList<CargaModel>();
        if(cargas == null){
            return cargasModel;
        }
        for(var carga : cargas.getOut().getCarga()) {
            var cargaDetalhe = receberCargaDetalhe(carga.getNrCarga(), filial.getCodigoMili(), filial.getSenha(), false);
            if(!numerosCargasExistentes.contains(cargaDetalhe.getNumeroCarga())){
                cargasModel.add(cargaDetalhe);
            }
        }
        return cargasModel;
    }

    public CargaModel buscarCarga(Long nroCarga, Long idFilial) throws Exception {
        var frete = freteRepository.findByNumeroCargaAndFilialId(nroCarga, idFilial);
        var filial = filialService.getById(idFilial);
        var cargaModel = frete != null ? cargaAdapter.freteEntityToModel(frete) : receberCargaDetalhe(nroCarga, filial.getCodigoMili(), filial.getSenha(), true);
        var usuarioOp = usuarioService.getUserDetails();
        var respFatModel = UsuarioModel.builder().nome(usuarioOp.getNome()).id(usuarioOp.getId()).build();

        cargaModel.setResponsavelOperacional(respFatModel);

        return cargaModel;
    }

    public CargaModel receberCargaDetalhe(Long nroCarga, Long codigoMili, String senha, boolean isArquivoObrigatorio) throws Exception {
       // var request = new ReceberCarga(codigoMili, senha, nroCarga);
        var cargaMili = articleClient.receberCarga(nroCarga, codigoMili);
        var filialModel = filialService.getModelByCodigoMili(codigoMili);
        if(cargaMili == null) {
            if(isArquivoObrigatorio) {
                throw new BoaMinutaBusinessException("Não existe arquivo disponivel desta carga");
            } else {
                var cargaModel = new CargaModel();
                cargaModel.setNumeroCarga(nroCarga);
                cargaModel.setFilial(filialModel);
                return cargaModel;
            }
        }
        return cargaAdapter.receberCargaDetalheResponseToCargaModel(cargaMili, filialModel);
    }

    @Transactional
    public void salvar(FreteEntity frete) throws Exception {
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

    public MinutaCargaModel buscarRelatorioMinuta(Long idFrete){
        var frete = freteRepository.findById(idFrete).get();
        var minuta = new MinutaCargaModel();
        var cidades = frete.getPedidos().stream().map(p -> p.getCliente()).map(c -> c.getCidade()).distinct();

        minuta.setDireto("BOM TRANSPORTE");
        minuta.setNumeroCarga(frete.getNumeroCarga());
        minuta.setPlaca(frete.getCaminhao().getPlaca());
        minuta.setMotorista(frete.getCaminhao().getMotorista().getNome());
        minuta.setRedespacho("NÃO");
        minuta.setDataSaida(frete.getDataSaida());
        minuta.setValorTotal(frete.getValorCarga());
        minuta.setDataFatura(LocalDateTime.now());
        minuta.setIcmsFrete(frete.getIcms());
        minuta.setPedagio(frete.getPedagio());
        minuta.setPesoBruto(0.0);
        minuta.setTotalVolumes(0.0);
        minuta.setTaxaEntrega(0.0);
        minuta.setVolumeTotalCaminhao(0.0);
        minuta.setVolumeTotalCarga(0.0);
        minuta.setValorFrete(frete.getFrete());
        minuta.setObservacoes(frete.getObservacoes());
        minuta.setPedidos(pedidoEntityToModel(frete.getPedidos()));
        minuta.setClientes(getClientes(frete.getPedidos()));
        minuta.setCidades(cidades.count());

        for (var pedido: frete.getPedidos()){
            calcularCamposItem(minuta, pedido);
        }

        return minuta;
    }

    private void calcularCamposItem(MinutaCargaModel minutaCargaModel, PedidoEntity pedido){
        var itens = pedido.getItensPedido();
        var pesoBruto = new BigDecimal(minutaCargaModel.getPesoBruto());
        var volumeCargas = new BigDecimal(minutaCargaModel.getVolumeTotalCarga());
        var qtdVolumes = new BigDecimal(minutaCargaModel.getTotalVolumes());

        for(var item : itens){
            pesoBruto = pesoBruto.add(item.getPesoBrutoUnitario());
            volumeCargas = volumeCargas.add(item.getVolume());
            qtdVolumes = qtdVolumes.add(item.getQuantidade());
        }

        minutaCargaModel.setPesoBruto(pesoBruto.doubleValue());
        minutaCargaModel.setVolumeTotalCarga(volumeCargas.doubleValue());
        minutaCargaModel.setTotalVolumes(qtdVolumes.doubleValue());
    }

    private List<ClienteModel> getClientes(List<PedidoEntity> pedidos){
        var clientes = new ArrayList<ClienteModel>();
        var clientesEntity = pedidos.stream().map(p -> p.getCliente()).distinct().collect(Collectors.toList());
        clientesEntity.forEach(c -> {
            var model = new ClienteModel();
            model.setNome(c.getNome());
            model.setEndereco(c.getEndereco());
            model.setCidade(c.getCidade().getNome());
            clientes.add(model);
        });

        return clientes;
    }

    private ArrayList<PedidoModel> pedidoEntityToModel(List<PedidoEntity> pedidosEntity){
        var pedidosModel = new ArrayList<PedidoModel>();
        for(var pedidoEntity : pedidosEntity ){
            var pedidoModel = pedidoService.pedidoEntityToModel(pedidoEntity);

            pedidosModel.add(pedidoModel);
        }

        return pedidosModel;
    }

}
