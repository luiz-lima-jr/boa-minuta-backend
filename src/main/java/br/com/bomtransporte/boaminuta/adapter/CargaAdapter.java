package br.com.bomtransporte.boaminuta.adapter;

import br.com.bomtransporte.boaminuta.enuns.TipoAliquotaEnum;
import br.com.bomtransporte.boaminuta.exception.AliquotaException;
import br.com.bomtransporte.boaminuta.mili.Carga;
import br.com.bomtransporte.boaminuta.mili.ConsultarCargasDisponiveisResponse;
import br.com.bomtransporte.boaminuta.mili.ReceberCargaResponse;
import br.com.bomtransporte.boaminuta.model.CargaModel;
import br.com.bomtransporte.boaminuta.model.FilialModel;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.entity.ClienteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IClienteRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IMunicipioRepository;
import br.com.bomtransporte.boaminuta.service.AliquotaService;
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
public class CargaAdapter {

    @Autowired
    private AliquotaService aliquotaService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private IMunicipioRepository municipioRepository;

    @Autowired
    private FilialService filialService;

    public Set<CargaModel> consultarCargasDisponivelsToCargaModel(ConsultarCargasDisponiveisResponse response, FilialModel filial){
        var cargas = new HashSet<CargaModel>();
        if(response.getOut().getCarga() != null && !response.getOut().getCarga().isEmpty()){
            response.getOut().getCarga().forEach(cargaResponse -> {
                if(cargaResponse.getOperacao().getValue().equals("INSERT")){
                    var cargaModel = new CargaModel();
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
    private void setClientesVolumes(Carga cargaResponse, CargaModel cargaModel){
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

    public CargaModel receberCargaDetalheResponseToCargaModel(ReceberCargaResponse cargaResponse, FilialModel filial) throws AliquotaException {
        var cargaModel = new CargaModel();
        var cargaOut = cargaResponse.getOut();

        cargaModel.setNumeroCarga(cargaOut.getNrCarga());
        cargaModel.setPlaca(cargaOut.getCaminhao().getValue().getPlaca().getValue());
        cargaModel.setValorCarga(cargaOut.getVlrConhecimento());
        cargaModel.setEntregas(cargaOut.getTotalEntrega());
        cargaModel.setComplementoCalculo(cargaOut.getVlrRedespacho());

        cargaModel.setObservacoes(cargaOut.getObservacao().getValue());

        setClientesVolumes(cargaOut, cargaModel);
        setDatas(cargaOut, cargaModel);

        //cargaModel.setFobCif()/;

        cargaModel.setAliquotaIss(aliquotaService.buscarValorAliquotaFilial(2L, TipoAliquotaEnum.ISS.getId()));
        cargaModel.setAliquotaPisCofins(aliquotaService.buscarValorAliquotaOrigemDestino(1L, 2L, TipoAliquotaEnum.PIS_COFINS.getId()));
        cargaModel.setAliquotaCustos(aliquotaService.buscarValorAliquotaOrigemDestino(1L, 2L, TipoAliquotaEnum.CUSTOS.getId()));
        cargaModel.setAliquotaIrcs(aliquotaService.buscarValorAliquotaOrigemDestino(1L, 2L, TipoAliquotaEnum.IRRF.getId()));
        cargaModel.setAliquotaIcms(aliquotaService.buscarValorAliquotaOrigemDestino(1L, 2L, TipoAliquotaEnum.ICMS.getId()));
        cargaModel.setFilial(filial);

        cargaModel.setObservacoes(cargaOut.getObservacao().getValue());

        var municipioDestino = municipioRepository.findByCodigoIbge(cargaOut.getCodIbge().longValue());
        cargaModel.setMunicipioDestino(municipioDestino);

        var filialEntity = filialService.getByCodigoMili(Long.parseLong(cargaOut.getLocalCarregamento().getValue()));

        cargaModel.setMunicipioOrigem(filialEntity);

        return cargaModel;
    }

    private void setDatas(Carga cargaOut, CargaModel cargaModel){
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

    public CargaModel freteEntityToModel(FreteEntity frete){
        var cargaModel = new CargaModel();
        cargaModel.setId(frete.getId());

        setDadosFrete(cargaModel, frete);

        //cargaModel.setDestino();
        //cargaModel.setCliente(cargaOut.getClienteRetira().getValue());
        cargaModel.setDataLimiteCarregamento(frete.getDataLimiteCarregamento());
        cargaModel.setDataLiberacaoFaturamento(frete.getDataLiberacaoFaturamento());
        cargaModel.setFilial(new FilialModel(frete.getFilial().getId(), frete.getFilial().getNome()));
        cargaModel.setMunicipioDestino(frete.getMunicipioDestino());
        cargaModel.setMunicipioOrigem(frete.getMunicipioOrigem());

        cargaModel.setCaminhao(frete.getCaminhao());

        setCalculos(cargaModel, frete);

        return cargaModel;
    }

    private void setDadosFrete(CargaModel cargaModel, FreteEntity frete) {
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

        cargaModel.setPlaca(frete.getCaminhao().getPlaca());
        cargaModel.setNumeroCarga(frete.getNumeroCarga());
        cargaModel.setFaturado(frete.isFaturado());
        cargaModel.setVolumes(frete.getEntregas());
        cargaModel.setM3(frete.getM3());
        cargaModel.setEntregas(frete.getEntregas());
        cargaModel.setComplemento(frete.getComplemento());
        cargaModel.setDataSaida(frete.getDataSaida());
        var clientes = frete.getPedidos().stream().map(f -> f.getCliente()).collect(Collectors.toSet());
        cargaModel.setClientes(clientes);

        cargaModel.setDestino(frete.getMunicipioDestino());
    }

    private void setCalculos(CargaModel cargaModel, FreteEntity frete){
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
        cargaModel.setMargem(frete.getFrete());
        cargaModel.setMarkup(frete.getMarkup());
        cargaModel.setObservacoes(frete.getObservacoes());
    }

}
