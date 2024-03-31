package br.com.bomtransporte.boaminuta.persistence.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "usuario_filial")
public class UsuarioFilialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioId")
    @NotNull
    private UsuarioEntity usuario;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "filialId")
    @NotNull
    private FilialEntity filial;
}
