package br.com.bomtransporte.boaminuta.model.relatorio;

import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class RelatorioIndicadorDesempenhoMarkup {

    private UsuarioModel responsavel;
    private int cargas;
    private double m3;
    private double fretes;
    private double markup;

}
