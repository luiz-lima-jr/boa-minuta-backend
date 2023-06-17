package br.com.bomtransporte.boaminuta.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadosSessaoModel {
    private String nome;

    private String email;
}
