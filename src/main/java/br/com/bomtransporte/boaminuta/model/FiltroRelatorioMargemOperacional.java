package br.com.bomtransporte.boaminuta.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class FiltroRelatorioMargemOperacional {

    private List<FilialModel> filiais;

    private LocalDateTime inicio;

    private LocalDateTime fim;

    private List<UsuarioModel> responsaveis;
}
