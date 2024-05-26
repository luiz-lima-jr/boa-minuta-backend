package br.com.bomtransporte.boaminuta.model.relatorio;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class RelatorioIndicadorDesempenhoFretesModel {

    private List<IndicadorDesempenhoResponsavelModel> list;
    private int totalCargas;
    private Double totalM3;
    private Double totalFrete;
    private Double totalComplemento;
    private Double totalFretePago;
    private Double totalSomaImpostos;
    private Double totalPedagio;

    public RelatorioIndicadorDesempenhoFretesModel(){
        totalCargas = 0;
        totalM3 = 0.0;
        totalFrete = 0.0;
        totalComplemento = 0.0;
        totalFretePago = 0.0;
        totalSomaImpostos = 0.0;
        totalPedagio = 0.0;
    }

    public void addTotalCargas(int totalCargas) {
        this.totalCargas += totalCargas;
    }

    public void addTotalM3(Double totalM3) {
        this.totalM3 += totalM3;
    }

    public void addTotalFrete(Double totalFrete) {
        this.totalFrete += totalFrete;
    }

    public void addTotalComplemento(Double totalComplemento) {
        this.totalComplemento += totalComplemento;
    }

    public void addTotalFretePago(Double totalFretePago) {
        this.totalFretePago += totalFretePago;
    }

    public void addTotalSomaImpostos(Double totalSomaImpostos) {
        this.totalSomaImpostos += totalSomaImpostos;
    }

    public void addTotalPedagio(Double totalPedagio) {
        this.totalPedagio += totalPedagio;
    }
}
