package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "transportador")
@Data
public class TransportadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "responsavelOperacionalId")
    private PessoaTransporteEntity pessoaTransporte;

}
