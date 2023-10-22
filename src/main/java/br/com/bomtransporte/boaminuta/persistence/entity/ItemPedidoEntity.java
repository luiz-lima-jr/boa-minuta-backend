package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity(name = "item_pedido")
@Data
public class ItemPedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pedido_id")
    private PedidoEntity pedido;

    private String descricao;
    private BigDecimal volume;
    private BigDecimal quantidade;
    private BigDecimal pesoBrutoUnitario;
    private BigDecimal valorUnitario;
}
