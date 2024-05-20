package br.com.bomtransporte.boaminuta.model;

import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class FreteFiltro {
    private Boolean semPlaca;
    private Boolean comPlaca;
    private Boolean faturadas;
    private LocalDate dataInicioFaturamento;
    private LocalDate dataFimFaturamento;
    private Long numeroCarga;
    private List<FilialEntity> filiais;
    private List<UsuarioModel> responsaveis;
    private boolean freteCalculado;
    private int pagina;
    private int qtdPagina;
    private String coluna;
    private String direcao;

}
