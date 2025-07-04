package br.com.bomtransporte.boaminuta.persistence.entity;

import br.com.bomtransporte.boaminuta.enuns.ExperienciaBomEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity(name = "pessoa_transporte")
@Data
public class PessoaTransporteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "responsavelOperacionalId")
    private UsuarioEntity responsavelOperacional;



}
