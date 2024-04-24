package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "pedido")
@Data
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroPedido;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "freteId")
    private FreteEntity frete;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemPedidoEntity> itensPedido;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clienteId")
    private ClienteEntity cliente;
}
