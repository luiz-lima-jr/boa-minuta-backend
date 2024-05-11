package br.com.bomtransporte.boaminuta.controller.relatorio;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioMargemOperacionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "margem-operacional")
public class RelatorioMargemOperacionalController extends BaseRelatorioController{


    private RelatorioMargemOperacionalService relatorioMargemOperacionalService;

    @Autowired
    public RelatorioMargemOperacionalController(RelatorioMargemOperacionalService relatorioMargemOperacionalService){
        super(relatorioMargemOperacionalService);
        this.relatorioMargemOperacionalService = relatorioMargemOperacionalService;
    }

    @PostMapping
    public ResponseEntity buscarPorFiltro(@RequestBody FreteFiltro filtro) throws BoaMinutaBusinessException {
        var resultados = relatorioMargemOperacionalService.buscarPorFiltro(filtro);
        return ResponseEntity.ok(resultados);
    }

}
