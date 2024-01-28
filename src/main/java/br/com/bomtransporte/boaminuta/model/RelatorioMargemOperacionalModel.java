package br.com.bomtransporte.boaminuta.model;

import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.MunicipioEntity;
import lombok.Data;

import java.util.List;

@Data
public class RelatorioMargemOperacionalModel {

    private List<FreteModel> fretes;
    private Double totalFrete;
    private Double totalFretePago;
    private Double totalCustos;
    private Double totalSaldo;

}
