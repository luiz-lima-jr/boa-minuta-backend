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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioId")
    @NotNull
    private UsuarioEntity usuario;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "funcaoId")
    @NotNull
    private FuncaoEntity funcao;
}
