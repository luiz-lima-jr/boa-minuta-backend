package br.com.bomtransporte.boaminuta.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilialModel {

    public FilialModel(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    private Long id;
    private String nome;
    private Long codigoMili;
}
