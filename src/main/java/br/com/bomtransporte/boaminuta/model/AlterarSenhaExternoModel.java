package br.com.bomtransporte.boaminuta.model;

import lombok.Data;

@Data
public class AlterarSenhaExternoModel {
    private String token;
    private String senha;
}
