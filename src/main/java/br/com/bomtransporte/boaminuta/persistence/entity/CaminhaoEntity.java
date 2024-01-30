package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Entity(name = "caminhao")
@Data
public class CaminhaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_transporte_transportador_id")
    private PessoaTransporteEntity transportador;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_transporte_motorista_id")
    private PessoaTransporteEntity motorista;

    @NotNull
    @Column(name = "data_alteracao")
    private LocalDateTime dataAlteracao;
}
