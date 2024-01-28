package br.com.bomtransporte.boaminuta.service.relatorio;

import br.com.bomtransporte.boaminuta.model.ClienteModel;
import br.com.bomtransporte.boaminuta.model.relatorio.MinutaCargaModel;
import br.com.bomtransporte.boaminuta.model.PedidoModel;
import br.com.bomtransporte.boaminuta.persistence.entity.PedidoEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IFreteRepository;
import br.com.bomtransporte.boaminuta.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RelatorioMinutaService {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private IFreteRepository freteRepository;

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

    private ArrayList<PedidoModel> pedidoEntityToModel(List<PedidoEntity> pedidosEntity){
        var pedidosModel = new ArrayList<PedidoModel>();
        for(var pedidoEntity : pedidosEntity ){
            var pedidoModel = pedidoService.pedidoEntityToModel(pedidoEntity);

            pedidosModel.add(pedidoModel);
        }

        return pedidosModel;
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


}
