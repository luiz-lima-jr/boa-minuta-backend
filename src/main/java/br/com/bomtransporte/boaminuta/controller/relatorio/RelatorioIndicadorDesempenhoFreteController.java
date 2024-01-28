package br.com.bomtransporte.boaminuta.controller.relatorio;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.relatorio.FiltroRelatorios;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioIndicadorDesempenhoFreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "indicador-desempenho-frete")
public class RelatorioIndicadorDesempenhoFreteController extends BaseRelatorioController{

    private RelatorioIndicadorDesempenhoFreteService relatorioIndicadorDesempenhoFreteService;

    @Autowired
    public RelatorioIndicadorDesempenhoFreteController(RelatorioIndicadorDesempenhoFreteService relatorioMargemOperacionalService) {
        super(relatorioMargemOperacionalService);
        this.relatorioIndicadorDesempenhoFreteService = relatorioMargemOperacionalService;
    }

    @PostMapping
    public ResponseEntity buscarPorFiltro(@RequestBody FiltroRelatorios filtro) throws BoaMinutaBusinessException {
        var resultados = relatorioIndicadorDesempenhoFreteService.buscarPorFiltro(filtro);
        return ResponseEntity.ok(resultados);
    }

}
