package br.com.bomtransporte.boaminuta.model.relatorio;

import br.com.bomtransporte.boaminuta.model.FilialModel;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class FiltroRelatorios {

    private List<FilialModel> filiais;

    private LocalDateTime inicio;

    private LocalDateTime fim;

    private List<UsuarioModel> responsaveis;
}
