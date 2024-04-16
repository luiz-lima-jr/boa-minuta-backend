package br.com.bomtransporte.boaminuta.adapter;

import br.com.bomtransporte.boaminuta.enuns.TipoAliquotaEnum;
import br.com.bomtransporte.boaminuta.exception.AliquotaException;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.exception.FreteException;
import br.com.bomtransporte.boaminuta.mili.Carga;
import br.com.bomtransporte.boaminuta.mili.ConsultarCargasDisponiveisResponse;
import br.com.bomtransporte.boaminuta.mili.ReceberCargaResponse;
import br.com.bomtransporte.boaminuta.model.FilialModel;
import br.com.bomtransporte.boaminuta.model.FreteModel;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.entity.EstadoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IMunicipioRepository;
import br.com.bomtransporte.boaminuta.service.AliquotaService;
import br.com.bomtransporte.boaminuta.service.CaminhaoService;
import br.com.bomtransporte.boaminuta.service.ClienteService;
import br.com.bomtransporte.boaminuta.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class FreteAdapter {

    @Autowired
    private AliquotaService aliquotaService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private IMunicipioRepository municipioRepository;
    @Autowired
    private FilialService filialService;
    @Autowired
    private CaminhaoService caminhaoService;

    public FreteModel freteEntityToModel(FreteEntity frete) throws BoaMinutaBusinessException {
        var filial = frete.getFilial();
        var cargaModel = new FreteModel();
        cargaModel.setId(frete.getId());
        var respFatEntity = frete.getResponsavelFaturamento();
        if(frete.getResponsavelFaturamento() != null){
            var respFatModel = UsuarioModel.builder().nome(respFatEntity.getNome()).id(respFatEntity.getId()).build();
            cargaModel.setResponsavelFaturamento(respFatModel);
        }

        var respOpEntity = frete.getResponsavelOperacional();
        if(frete.getResponsavelOperacional() != null) {
            var respOpModel = UsuarioModel.builder().nome(respOpEntity.getNome()).id(respOpEntity.getId()).build();
            cargaModel.setResponsavelOperacional(respOpModel);
        }
        cargaModel.setClientes(frete.getClientes());

        cargaModel.setNumeroCarga(frete.getNumeroCarga());
        cargaModel.setPlaca(frete.getPlaca());
        cargaModel.setFaturado(frete.isFaturado());
        cargaModel.setVolumes(frete.getEntregas());
        cargaModel.setM3(frete.getM3());
        cargaModel.setEntregas(frete.getEntregas());
        cargaModel.setComplemento(frete.getComplemento());
        cargaModel.setDataSaida(frete.getDataSaida());
        cargaModel.setMunicipioDestino(frete.getMunicipioDestino());
        cargaModel.setValorCarga(frete.getValorCarga());
        cargaModel.setPedagio(frete.getPedagio());
        cargaModel.setComplementoCalculo(frete.getComplementoCalculo());
        cargaModel.setDescontos(frete.getDescontos());
        cargaModel.setFrete(frete.getFrete());
        cargaModel.setFobCif(frete.getFobCif());
        cargaModel.setPagamentoPedagio(frete.getPagamentoPedagio());
        cargaModel.setNfse(frete.getNfse());
        cargaModel.setFretePago(frete.getFretePago());
        cargaModel.setIss(frete.getIss());
        cargaModel.setPisCofins(frete.getPisCofins());
        cargaModel.setIcms(frete.getIcms());
        cargaModel.setCustos(frete.getCustos());
        cargaModel.setIrCs(frete.getIrCs());
        cargaModel.setSaldo(frete.getSaldo());
        cargaModel.setMargem(frete.getMargem());
        cargaModel.setMarkup(frete.getMarkup());
        cargaModel.setObservacoes(frete.getObservacoes());
        cargaModel.setDataLimiteCarregamento(frete.getDataLimiteCarregamento());
        cargaModel.setDataLiberacaoFaturamento(frete.getDataLiberacaoFaturamento());
        cargaModel.setFilial(new FilialModel(filial.getId(), filial.getNome(), filial.getCodigoMili()));
        cargaModel.setMunicipioDestino(frete.getMunicipioDestino());
        cargaModel.setMunicipioOrigem(frete.getMunicipioOrigem());
        setAliquotasCargaModel(cargaModel, frete.getFilial(), frete.getMunicipioDestino().getEstado());

        cargaModel.setCaminhao(frete.getCaminhao());

        return cargaModel;
    }

    public Set<FreteModel> consultarCargasDisponivelsToCargaModel(ConsultarCargasDisponiveisResponse response, FilialModel filial){
        var cargas = new HashSet<FreteModel>();
        if(response.getOut().getCarga() != null && !response.getOut().getCarga().isEmpty()){
            response.getOut().getCarga().forEach(cargaResponse -> {
                if(cargaResponse.getOperacao().getValue().equals("INSERT")){
                    var cargaModel = new FreteModel();
                    cargaModel.setNumeroCarga(cargaResponse.getNrCarga());
                    var placa = cargaResponse.getCaminhao().getValue().getPlaca();
                    cargaModel.setPlaca(placa == null ? null : placa.getValue());
                    cargaModel.setValorCarga(cargaResponse.getVlrConhecimento());
                    //cargaModel.setDataLimiteCarregamento(cargaResponse.getOut().getDt);
                    var dtLiberacaoFaturamento = cargaResponse.getDtLiberacaoFaturamento().getValue();
                    //29/06/2023 14:51:25
                    var df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                    cargaModel.setDataLiberacaoFaturamento(dtLiberacaoFaturamento.isEmpty() ? null : LocalDateTime.parse(dtLiberacaoFaturamento, df));
                    cargaModel.setObservacoes(cargaResponse.getObservacao().getValue());

                    cargaModel.setFilial(filial);
                    cargas.add(cargaModel);
                }
            });
        }

        return cargas;
    }
    private void setClientesVolumes(Carga cargaResponse, FreteModel cargaModel){
        var volume = 0.0;
        cargaModel.setClientes(new HashSet<>());
        for(var pedido : cargaResponse.getPedidos().getValue().getPedido()){
            for(var itemPedido : pedido.getItensPedidos().getValue().getItemPedido()){
                volume += itemPedido.getProduto().getValue().getVolumeM3();
            }
            var clienteEntity = clienteService.montarCliente(pedido.getCliente().getValue());
            cargaModel.getClientes().add(clienteEntity);
        }
        cargaModel.setM3(volume);
    }
    private void setClientesVolumes(Carga cargaResponse, FreteEntity frete){
        var volume = 0.0;
        frete.setClientes(new HashSet<>());
        for(var pedido : cargaResponse.getPedidos().getValue().getPedido()){
            for(var itemPedido : pedido.getItensPedidos().getValue().getItemPedido()){
                volume += itemPedido.getProduto().getValue().getVolumeM3();
            }
            var clienteEntity = clienteService.montarCliente(pedido.getCliente().getValue(), frete);
            frete.getClientes().add(clienteEntity);
        }
        frete.setM3(volume);
    }

    public FreteModel receberCargaDetalheResponseToCargaModel(ReceberCargaResponse cargaResponse, FilialModel filial) throws AliquotaException {
        var cargaModel = new FreteModel();
        var cargaOut = cargaResponse.getOut();
        var municipioDestino = municipioRepository.findByCodigoIbge(cargaOut.getCodIbge().longValue());
        var filialOrigem = filialService.getByCodigoMili(Long.parseLong(cargaOut.getLocalCarregamento().getValue()));

        cargaModel.setNumeroCarga(cargaOut.getNrCarga());
        cargaModel.setPlaca(cargaOut.getCaminhao().getValue().getPlaca().getValue());
        cargaModel.setValorCarga(cargaOut.getVlrConhecimento());
        cargaModel.setEntregas(cargaOut.getTotalEntrega());
        cargaModel.setComplementoCalculo(cargaOut.getVlrRedespacho());

        cargaModel.setObservacoes(cargaOut.getObservacao().getValue());
        setAliquotasCargaModel(cargaModel, filialOrigem, municipioDestino.getEstado());
        setClientesVolumes(cargaOut, cargaModel);
        setDatas(cargaOut, cargaModel);

        cargaModel.setFilial(filial);
        cargaModel.setObservacoes(cargaOut.getObservacao().getValue());
        cargaModel.setMunicipioDestino(municipioDestino);
        cargaModel.setMunicipioOrigem(filialOrigem);

        return cargaModel;
    }

    public FreteEntity receberCargaDetalheResponseToFreteEntity(ReceberCargaResponse cargaResponse, FilialEntity filial) throws AliquotaException {
        var freteEntity = new FreteEntity();

        atualizarFreteEntity(freteEntity, cargaResponse, filial);

        return freteEntity;
    }

    public void atualizarFreteEntity(FreteEntity freteEntity, ReceberCargaResponse cargaResponse, FilialEntity filial)  throws AliquotaException {
        var cargaOut = cargaResponse.getOut();
        var municipioDestino = municipioRepository.findByCodigoIbge(cargaOut.getCodIbge().longValue());
        var filialOrigem = filialService.getByCodigoMili(Long.parseLong(cargaOut.getLocalCarregamento().getValue()));
        if(filialOrigem == null){
            throw new RuntimeException("Filial " + cargaOut.getLocalCarregamento().getValue() + " não cadastrada");
        }
        freteEntity.setNumeroCarga(cargaOut.getNrCarga());

        var caminhao = cargaOut.getCaminhao();
        if( caminhao != null && caminhao.getValue().getPlaca() != null){
            freteEntity.setPlaca(cargaOut.getCaminhao().getValue().getPlaca().getValue());
            var caminhaoExistente = caminhaoService.buscarPorPlaca(caminhao.getValue().getPlaca().getValue());
            if(caminhaoExistente != null){
                freteEntity.setCaminhao(caminhaoExistente);
            }
        }
        freteEntity.setValorCarga(cargaOut.getVlrConhecimento());
        freteEntity.setEntregas(cargaOut.getTotalEntrega());
        freteEntity.setComplementoCalculo(cargaOut.getVlrRedespacho());

        if(cargaOut.getObservacao() != null){
            freteEntity.setObservacoes(cargaOut.getObservacao().getValue());
        }
        setAliquotasFreteEntity(freteEntity, filialOrigem, municipioDestino.getEstado());
        setClientesVolumes(cargaOut, freteEntity);
        setDatas(cargaOut, freteEntity);

        freteEntity.setFilial(filial);
        freteEntity.setMunicipioDestino(municipioDestino);
        freteEntity.setMunicipioOrigem(filialOrigem);
    }

    private void setAliquotasCargaModel(FreteModel cargaModel, FilialEntity filialOrigem, EstadoEntity estadoDestino) throws AliquotaException {

        cargaModel.setAliquotaIss(aliquotaService.buscarValorAliquotaFilial(filialOrigem.getId(), TipoAliquotaEnum.ISS.getId()));
        cargaModel.setAliquotaPisCofins(aliquotaService.buscarValorAliquotaOrigemDestino(filialOrigem, estadoDestino, TipoAliquotaEnum.PIS_COFINS.getId()));
        cargaModel.setAliquotaCustos(aliquotaService.buscarValorAliquotaOrigemDestino(filialOrigem, estadoDestino, TipoAliquotaEnum.CUSTOS.getId()));
        cargaModel.setAliquotaIrcs(aliquotaService.buscarValorAliquotaOrigemDestino(filialOrigem, estadoDestino, TipoAliquotaEnum.IRRF.getId()));
        cargaModel.setAliquotaIcms(aliquotaService.buscarValorAliquotaOrigemDestino(filialOrigem, estadoDestino, TipoAliquotaEnum.ICMS.getId()));
    }

    private void setAliquotasFreteEntity(FreteEntity frete, FilialEntity filialOrigem, EstadoEntity estadoDestino) throws AliquotaException {

        frete.setAliquotaIss(aliquotaService.buscarValorAliquotaFilial(filialOrigem.getId(), TipoAliquotaEnum.ISS.getId()));
        frete.setAliquotaPisCofins(aliquotaService.buscarValorAliquotaOrigemDestino(filialOrigem, estadoDestino, TipoAliquotaEnum.PIS_COFINS.getId()));
        frete.setAliquotaCustos(aliquotaService.buscarValorAliquotaOrigemDestino(filialOrigem, estadoDestino, TipoAliquotaEnum.CUSTOS.getId()));
        frete.setAliquotaIrcs(aliquotaService.buscarValorAliquotaOrigemDestino(filialOrigem, estadoDestino, TipoAliquotaEnum.IRRF.getId()));
        frete.setAliquotaIcms(aliquotaService.buscarValorAliquotaOrigemDestino(filialOrigem, estadoDestino, TipoAliquotaEnum.ICMS.getId()));
    }

    private void setDatas(Carga cargaOut, FreteModel cargaModel){
        var df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        var dtLiberacaoFaturamento = cargaOut.getDtLiberacaoFaturamento();
        if(dtLiberacaoFaturamento != null){
            cargaModel.setDataLiberacaoFaturamento(LocalDateTime.parse(dtLiberacaoFaturamento.getValue(), df));
        }

        var dtSaida = cargaOut.getDtHrFaturamento();
        if(dtSaida != null){
            cargaModel.setDataSaida(LocalDateTime.parse(dtSaida.getValue(), df));
        }
    }

    private void setDatas(Carga cargaOut, FreteEntity cargaModel){
        var df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        var dtLiberacaoFaturamento = cargaOut.getDtLiberacaoFaturamento();
        if(dtLiberacaoFaturamento != null && !dtLiberacaoFaturamento.getValue().isEmpty()){
            cargaModel.setDataLiberacaoFaturamento(LocalDateTime.parse(dtLiberacaoFaturamento.getValue(), df));
        }

        var dtSaida = cargaOut.getDtHrFaturamento();
        if(dtSaida != null && !dtSaida.getValue().isEmpty()){
            cargaModel.setDataSaida(LocalDateTime.parse(dtSaida.getValue(), df));
        }
    }


}
