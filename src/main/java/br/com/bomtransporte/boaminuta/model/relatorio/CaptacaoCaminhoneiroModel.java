package br.com.bomtransporte.boaminuta.model.relatorio;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CaptacaoCaminhoneiroModel {

    private String responsavel;
    private String placa;
    private String experiencia;
}
