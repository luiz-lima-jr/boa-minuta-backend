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
    @JoinColumn(name = "pessoaTransportadorId")
    private PessoaTransporteEntity transportador;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "motoristaId")
    private MotoristaEntity motorista;

    @NotNull
    private LocalDateTime dataAlteracao;

    @Transient
    private boolean motoristaDiferente;

}
