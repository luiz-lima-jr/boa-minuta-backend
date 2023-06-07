package br.com.bomtransporte.boaminuta.persistence.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "usuario_funcao")
public class UsuarioFuncaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @NotNull
    private UsuarioEntity usuario;


    @ManyToOne
    @JoinColumn(name = "funcao_id")
    @NotNull
    private FuncaoEntity funcao;
}
