package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity(name = "municipio")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MunicipioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long codigoIbge;

    private String nome;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estadoId")
    private EstadoEntity estado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MunicipioEntity that = (MunicipioEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(codigoIbge, that.codigoIbge) && Objects.equals(nome, that.nome) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigoIbge, nome, estado);
    }
}
