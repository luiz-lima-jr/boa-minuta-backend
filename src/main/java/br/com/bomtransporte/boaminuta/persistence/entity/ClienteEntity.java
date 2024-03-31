package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity(name = "cliente")
@Data
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigoClienteMiliId")
    private Long codigoClienteMili;

    private String cnpj;

    private String nome;

    private String endereco;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estadoId")
    private EstadoEntity estado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "municipioId")
    private MunicipioEntity cidade;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity that = (ClienteEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(codigoClienteMili, that.codigoClienteMili) && Objects.equals(cnpj, that.cnpj) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigoClienteMili, cnpj, nome);
    }
}
