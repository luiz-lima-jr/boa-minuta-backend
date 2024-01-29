package br.com.bomtransporte.boaminuta.model;

import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class CargaFiltro {
    private Boolean semPlaca;
    private Boolean comPlaca;
    private Boolean faturadas;
    private LocalDateTime dataInicioFaturamento;
    private LocalDateTime dataFimFaturamento;
    private List<FilialEntity> filiais;
}
