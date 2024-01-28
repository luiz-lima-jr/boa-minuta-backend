package br.com.bomtransporte.boaminuta.model;

import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Objects;

@Validated
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {

    public UsuarioModel(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String email;

    @NotNull
    @NotEmpty
    private List<FuncaoEntity> funcoes;

    @NotNull
    @NotEmpty
    private List<FilialEntity> filiais;

    private Boolean situacao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioModel that = (UsuarioModel) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
