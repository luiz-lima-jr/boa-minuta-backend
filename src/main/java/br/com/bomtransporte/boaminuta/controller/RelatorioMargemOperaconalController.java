package br.com.bomtransporte.boaminuta.controller;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.AliquotaException;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FiltroRelatorioMargemOperacional;
import br.com.bomtransporte.boaminuta.service.RelatorioMargemOperacionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "margem-operacional")
public class RelatorioMargemOperaconalController {

    @Autowired
    private RelatorioMargemOperacionalService relatorioMargemOperacionalService;

    @PostMapping
    public ResponseEntity consultar(@RequestBody FiltroRelatorioMargemOperacional filtro) throws BoaMinutaBusinessException {
        var resultados = relatorioMargemOperacionalService.buscarPorFiltro(filtro);
        return ResponseEntity.ok(resultados);
    }

    @GetMapping("responsaveis-faturamento")
    public ResponseEntity buscarResponstaveisOperacional() {
        var resultados = relatorioMargemOperacionalService.buscarResponstaveisOperacional();
        return ResponseEntity.ok(resultados);
    }
}
