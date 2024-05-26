package br.com.bomtransporte.boaminuta.model.relatorio;

import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class IndicadorDesempenhoResponsavelModel {

    private UsuarioModel responsavel;
    private int cargas;
    private double m3;
    private double fretes;
    private double complemento;
    private double fretePago;
    private double somaImpostos;
    private double pedagio;

    public IndicadorDesempenhoResponsavelModel(UsuarioModel responsavel){
        this.responsavel = responsavel;
        this.cargas = 0;
        this.m3 = 0.0;
        this.fretes = 0.0;
        this.complemento = 0.0;
        this.fretePago = 0.0;
        this.somaImpostos = 0.0;
        this.pedagio = 0.0;
    }

    public void addCargas(int cargas) {
        this.cargas += cargas;
    }

    public void addM3(double m3) {
        this.m3 += m3;
    }

    public void addFretes(double fretes) {
        this.fretes += fretes;
    }

    public void addComplemento(double complemento) {
        this.complemento += complemento;
    }

    public void addFretePago(double fretepago) {
        this.fretePago += fretepago;
    }

    public void addSomaImpostos(double somaImpostos) {
        this.somaImpostos += somaImpostos;
    }

    public void addPedagio(double pedagio) {
        this.pedagio += pedagio;
    }
}