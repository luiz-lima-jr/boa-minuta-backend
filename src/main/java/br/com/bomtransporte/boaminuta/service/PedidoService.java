package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.mili.Pedido;
import br.com.bomtransporte.boaminuta.mili.ReceberCargaResponse;
import br.com.bomtransporte.boaminuta.model.PedidoModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.ItemPedidoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.PedidoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private ClienteService clienteService;

    public PedidoModel pedidoEntityToModel(PedidoEntity pedido){
        var pedidoModel = new PedidoModel();
        pedidoModel.setVolume(BigDecimal.ZERO);
        pedidoModel.setQtd(BigDecimal.ZERO);
        pedidoModel.setFrete(BigDecimal.ZERO);
        pedidoModel.setValorTotal(BigDecimal.ZERO);
        pedidoModel.setPesoBruto(BigDecimal.ZERO);
        var cliente = pedido.getCliente();
        var desc = pedido.getNumeroPedido() + " - " + cliente.getCidade().getNome() + "/" + cliente.getEstado().getSigla() + " " + cliente.getNome();
        pedidoModel.setDescricaoPedido(desc);

        for(var item : pedido.getItensPedido()){
            var valorTotal = item.getValorUnitario().multiply(item.getQuantidade());
            var pesoBruto = item.getPesoBrutoUnitario().multiply(item.getQuantidade());
            pedidoModel.setVolume(pedidoModel.getVolume().add(item.getVolume()));
            pedidoModel.setQtd(pedidoModel.getQtd().add(item.getQuantidade()));
            pedidoModel.setFrete(BigDecimal.ZERO);
            pedidoModel.setValorTotal(pedidoModel.getValorTotal().add(valorTotal));
            pedidoModel.setPesoBruto(pedidoModel.getPesoBruto().add(pesoBruto));
        }

        return pedidoModel;
    }


    public List<PedidoEntity> montarPedidos(FreteEntity frete, ReceberCargaResponse detalheCarga) throws Exception {
        var pedidosEntity = new ArrayList<PedidoEntity>();
        var pedidosOut = detalheCarga.getOut().getPedidos().getValue().getPedido();
        for(var pedidoOut : pedidosOut){
            var pedidoEntity = new PedidoEntity();
            var itensPedido = montarItemPedido(pedidoOut, pedidoEntity);
            var clienteEntity = clienteService.montarCliente(pedidoOut.getCliente().getValue());

            pedidoEntity.setNumeroPedido(pedidoOut.getNrPedido().getValue());
            pedidoEntity.setItensPedido(itensPedido);
            pedidoEntity.setFrete(frete);
            pedidoEntity.setCliente(clienteEntity);

            pedidosEntity.add(pedidoEntity);
        }
        return pedidosEntity;
    }



    private List<ItemPedidoEntity> montarItemPedido(Pedido pedidoOut, PedidoEntity pedidoEntity){
        var itensPedidoEntity = new ArrayList<ItemPedidoEntity>();
        for(var itemPedidoOut : pedidoOut.getItensPedidos().getValue().getItemPedido()){
            var itemPedidoEntity = new ItemPedidoEntity();
            var produtoOut = itemPedidoOut.getProduto().getValue();

            itemPedidoEntity.setQuantidade(new BigDecimal(itemPedidoOut.getQtde()));
            itemPedidoEntity.setDescricao(produtoOut.getDescricao().getValue());
            itemPedidoEntity.setVolume(new BigDecimal(produtoOut.getVolumeM3()));
            itemPedidoEntity.setPedido(pedidoEntity);
            itemPedidoEntity.setPesoBrutoUnitario(new BigDecimal(produtoOut.getPesoBruto()));
            itemPedidoEntity.setValorUnitario(new BigDecimal(itemPedidoOut.getPrecoUnitario()));
            itensPedidoEntity.add(itemPedidoEntity);
        }
        return itensPedidoEntity;
    }


}
