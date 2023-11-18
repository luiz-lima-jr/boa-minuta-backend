package br.com.bomtransporte.boaminuta.controller;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.model.CargaFiltro;
import br.com.bomtransporte.boaminuta.model.FreteModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.service.FreteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "carga")
public class FreteController {

    @Autowired
    private FreteService cargaService;

    @PostMapping("cargas-disponiveis")
    public ResponseEntity<List<FreteModel>> consultarCargasDisponiveis(@RequestBody CargaFiltro filtro) throws Exception {
        return ResponseEntity.ok(cargaService.consultarCargas(filtro));
    }

    @GetMapping("detalhe-carga")
    public ResponseEntity<FreteModel> consultarDetalheCarga(@RequestParam Long nroCarga, @RequestParam Long idFilial) throws Exception {
        return ResponseEntity.ok(cargaService.buscarCarga(nroCarga, idFilial));
    }
    
    @PostMapping
    public ResponseEntity salvar(@Valid @RequestBody FreteEntity frete) throws Exception {
        cargaService.salvar(frete);
        return ResponseEntity.ok().build();
    }



}
