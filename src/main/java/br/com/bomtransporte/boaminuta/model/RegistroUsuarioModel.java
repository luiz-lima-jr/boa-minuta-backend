package br.com.bomtransporte.boaminuta.model;

import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import java.util.List;


@Validated
@Data
public class RegistroUsuarioModel {

    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String email;

    private String senha;

    @NotNull
    @NotEmpty
    private List<FuncaoEntity> funcoes;

    @NotNull
    @NotEmpty
    private List<FilialEntity> filiais;

    private boolean situacao;
}