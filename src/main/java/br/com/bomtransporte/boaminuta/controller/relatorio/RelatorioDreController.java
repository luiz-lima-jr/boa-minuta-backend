package br.com.bomtransporte.boaminuta.controller.relatorio;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.model.relatorio.RelatorioCaptacaoCaminhoneiroModel;
import br.com.bomtransporte.boaminuta.service.relatorio.BaseRelatorioService;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioCaptacaoCaminhoesService;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioDreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "dre")
public class RelatorioDreController extends BaseRelatorioController {

    @Autowired
    private RelatorioDreService relatorioService;

    public RelatorioDreController(RelatorioDreService baseRelatorioService) {
        super(baseRelatorioService);
        this.relatorioService = baseRelatorioService;
    }

    @Override
    @PostMapping
    public ResponseEntity buscarPorFiltro(@RequestBody FreteFiltro filtro) throws BoaMinutaBusinessException {
        var resultados = relatorioService.buscarPorFiltro(filtro);
        return ResponseEntity.ok(resultados);
    }
    @GetMapping("anos")
    public ResponseEntity getAnos() throws BoaMinutaBusinessException {
        return ResponseEntity.ok(relatorioService.getAnos());
    }
}
