package br.com.bomtransporte.boaminuta.model.relatorio;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class RelatorioCaptacaoCaminhoneiroModel {

    private List<CaptacaoCaminhoneiroModel> list;
    private long novoParaCarregamento;
    private long carregaSempre;
    private long retornando;
}
