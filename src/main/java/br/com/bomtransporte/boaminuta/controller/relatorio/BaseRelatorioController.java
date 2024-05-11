package br.com.bomtransporte.boaminuta.controller.relatorio;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.service.relatorio.BaseRelatorioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public abstract class BaseRelatorioController {

    private BaseRelatorioService baseRelatorioService;

    public BaseRelatorioController(BaseRelatorioService baseRelatorioService){
        this.baseRelatorioService = baseRelatorioService;
    }
    abstract ResponseEntity buscarPorFiltro(FreteFiltro filtro) throws BoaMinutaBusinessException;

        @GetMapping("responsaveis-faturamento")
    public ResponseEntity buscarResponstaveisOperacional() {
        var resultados = baseRelatorioService.buscarResponstaveisOperacional();
        return ResponseEntity.ok(resultados);
    }

}
