package br.com.bomtransporte.boaminuta.controller.relatorio;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.model.relatorio.RelatorioCaptacaoCaminhoneiroModel;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioCaptacaoCaminhoesService;
import br.com.bomtransporte.boaminuta.service.relatorio.RelatorioIndicadorDesempenhoFreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "captacao-caminhoneiro")
public class RelatorioCaptacaoCaminhoneiroController extends BaseRelatorioController{

    @Autowired
    private RelatorioCaptacaoCaminhoesService relatorioService;

    public RelatorioCaptacaoCaminhoneiroController(RelatorioIndicadorDesempenhoFreteService baseRelatorioService) {
        super(baseRelatorioService);
    }

    @Override
    @PostMapping
    public ResponseEntity buscarPorFiltro(@RequestBody FreteFiltro filtro) throws BoaMinutaBusinessException {
        RelatorioCaptacaoCaminhoneiroModel resultados = relatorioService.buscarPorFiltro(filtro);
        return ResponseEntity.ok(resultados);
    }
}