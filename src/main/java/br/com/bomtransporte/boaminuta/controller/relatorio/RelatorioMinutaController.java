package br.com.bomtransporte.boaminuta.controller.relatorio;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioMinutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "minuta")
public class RelatorioMinutaController {

    @Autowired
    private RelatorioMinutaService relatorioMinutaService;

    @GetMapping("{idFrete}")
    public ResponseEntity minuta(@PathVariable("idFrete") Long idFrete){
        var minuta = relatorioMinutaService.buscarRelatorioMinuta(idFrete);
        return ResponseEntity.ok(minuta);
    }

}
