package br.com.bomtransporte.boaminuta.model.relatorio;

import br.com.bomtransporte.boaminuta.model.FreteModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.MunicipioEntity;
import lombok.Data;

import java.util.List;

@Data
public class RelatorioMargemOperacionalModel {

    public RelatorioMargemOperacionalModel(){
        
    }

    private List<FreteModel> list;
    private Double totalFrete;
    private Double totalFretePago;
    private Double totalCustos;
    private Double totalSaldo;

}
