package br.com.bomtransporte.boaminuta.model;

import br.com.bomtransporte.boaminuta.enuns.ExperienciaBomEnum;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class FreteFiltro {
    private Boolean lancadas;
    private boolean faturadas;
    private LocalDateTime dataInicioFaturamento;
    private LocalDateTime dataFimFaturamento;
    private LocalDateTime dataInicioCadastro;
    private LocalDateTime dataFimCadastro;
    private Integer anoExercicio;
    private Long numeroCarga;
    private List<FilialEntity> filiais;
    private List<UsuarioModel> responsaveis;
    private boolean freteCalculado;
    private int pagina;
    private int qtdPagina;
    private String coluna;
    private String direcao;
    private List<ExperienciaBomEnum> experienciasBom = new ArrayList<>();

}
