package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "cliente_frete")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteFreteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clienteId")
    private ClienteEntity cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "freteId")
    private FreteEntity frete;

}
