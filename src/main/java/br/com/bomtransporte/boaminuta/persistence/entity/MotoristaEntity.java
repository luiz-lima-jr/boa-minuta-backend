package br.com.bomtransporte.boaminuta.persistence.entity;

import br.com.bomtransporte.boaminuta.enuns.ExperienciaBomEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity(name = "motorista")
@Data
public class MotoristaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "pessoaTransporteId")
    private PessoaTransporteEntity pessoaTransporte;

    @Enumerated(EnumType.STRING)
    private ExperienciaBomEnum experiencia;
}
