package br.com.bomtransporte.boaminuta.controller.relatorio;


import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioIndicadorDesempenhoFreteService;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioIndicadorDesempenhoMarkupService;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioMargemOperacionalService;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioMinutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioMinutaService relatorioMinutaService;

    @Autowired
    private RelatorioIndicadorDesempenhoFreteService relatorioIndicadorDesempenhoFreteService;
    @Autowired
    private RelatorioIndicadorDesempenhoMarkupService relatorioIndicadorDesempenhoMarkupService;

    @Autowired
    private RelatorioMargemOperacionalService relatorioMargemOperacionalService;

    @GetMapping("responsaveis-faturamento")
    public ResponseEntity buscarResponstaveisOperacional() {
        var resultados = relatorioIndicadorDesempenhoFreteService.buscarResponstaveisOperacional();
        return ResponseEntity.ok(resultados);
    }

    @PostMapping("indicador-desempenho-frete")
    public ResponseEntity indicadorDesempenhoFrete(@RequestBody FreteFiltro filtro) throws BoaMinutaBusinessException {
        var resultados = relatorioIndicadorDesempenhoFreteService.buscarPorFiltro(filtro);
        return ResponseEntity.ok(resultados);
    }

    @PostMapping("indicador-desempenho-markup")
    public ResponseEntity indicadorDesempenhoMarkup(@RequestBody FreteFiltro filtro) throws BoaMinutaBusinessException {
        var resultados = relatorioIndicadorDesempenhoMarkupService.buscarPorFiltro(filtro);
        return ResponseEntity.ok(resultados);
    }

    @PostMapping("margem-operacional")
    public ResponseEntity buscarPorFiltro(@RequestBody FreteFiltro filtro) throws BoaMinutaBusinessException {
        var resultados = relatorioMargemOperacionalService.buscarPorFiltro(filtro);
        return ResponseEntity.ok(resultados);
    }

    @GetMapping("minuta/{idFrete}")
    public ResponseEntity minuta(@PathVariable("idFrete") Long idFrete){
        var minuta = relatorioMinutaService.buscarRelatorioMinuta(idFrete);
        return ResponseEntity.ok(minuta);
    }

}
