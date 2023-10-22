package br.com.bomtransporte.boaminuta.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PedidoModel {
    private String numeroPedido;
    private String descricaoPedido;
    private String cidade;
    private String estado;
    private String cliente;
    private BigDecimal volume;
    private BigDecimal qtd;
    private BigDecimal frete;
    private BigDecimal valorTotal;
    private BigDecimal pesoBruto;
}
