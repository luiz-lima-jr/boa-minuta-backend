package br.com.bomtransporte.boaminuta.controller;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.AliquotaException;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.CargaFiltro;
import br.com.bomtransporte.boaminuta.model.CargaModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.service.CargaService;
import jakarta.validation.Valid;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "carga")
public class CargaController {

    @Autowired
    private CargaService cargaService;

    @PostMapping("cargas-disponiveis")
    public ResponseEntity<List<CargaModel>> consultarCargasDisponiveis(@RequestBody CargaFiltro filtro) throws Exception {
        return ResponseEntity.ok(cargaService.consultarCargas(filtro));
    }

    @GetMapping("detalhe-carga")
    public ResponseEntity<CargaModel> consultarDetalheCarga(@RequestParam Long nroCarga, @RequestParam Long idFilial) throws Exception {
        return ResponseEntity.ok(cargaService.buscarCarga(nroCarga, idFilial));
    }

    @PostMapping
    public ResponseEntity salvar(@Valid @RequestBody FreteEntity frete) throws Exception {
        cargaService.salvar(frete);
        return ResponseEntity.ok().build();
    }



}
