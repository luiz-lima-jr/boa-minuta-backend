package br.com.bomtransporte.boaminuta.model.relatorio;

import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Data
public class DreValoresModel {
    private int mes;
    private String nomeMes;
    private double valorCarga;
    private double complemento;
    private double totalReceitas;
    private double fretePago;
    private double pedagio;
    private double totalPagamentos;
    private double resultado;
    private double impostos;
    private double custos;
    private double totalDespesas;
    private double valorFinal;
    
    public static DreValoresModel calcularValores(List<FreteEntity> fretes){
        var dre = new DreValoresModel();
        dre.valorCarga = fretes.stream().mapToDouble(f -> f.getValorCarga()).sum();
        dre.complemento = fretes.stream().mapToDouble(f -> f.getComplementoCalculo()).sum();
        dre.totalReceitas = dre.valorCarga + dre.complemento;
        dre.fretePago = fretes.stream().mapToDouble(f -> f.getFretePago()).sum();
        dre.pedagio = fretes.stream().mapToDouble(f -> f.getPedagio()).sum();
        dre.totalPagamentos = dre.fretePago + dre.pedagio;
        dre.resultado = dre.totalReceitas - dre.totalPagamentos;
        double icms = fretes.stream().mapToDouble(f -> f.getIcms()).sum();
        double ircs = fretes.stream().mapToDouble(f -> f.getIrCs()).sum();
        double iss = fretes.stream().mapToDouble(f -> f.getIss()).sum();
        double pisCofins = fretes.stream().mapToDouble(f -> f.getPisCofins()).sum();
        dre.impostos = new BigDecimal(icms + iss + ircs + pisCofins).setScale(2, RoundingMode.CEILING).doubleValue();
        dre.custos = fretes.stream().mapToDouble(f -> f.getCustos()).sum();
        dre.custos = new BigDecimal(dre.custos).setScale(2, RoundingMode.CEILING).doubleValue();
        dre.totalDespesas = dre.impostos + dre.custos;
        dre.valorFinal = dre.resultado - dre.totalDespesas;

        return dre;
    }
}
