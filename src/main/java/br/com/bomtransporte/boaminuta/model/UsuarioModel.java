package br.com.bomtransporte.boaminuta.model;

import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
@Data
@Builder
public class UsuarioModel {

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
}
