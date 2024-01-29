package br.com.bomtransporte.boaminuta.controller;


import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.AliquotaException;
import br.com.bomtransporte.boaminuta.persistence.entity.AliquotaEntity;
import br.com.bomtransporte.boaminuta.service.AliquotaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "aliquota")
public class AliquotaController {

    @Autowired
    private AliquotaService service;

    @GetMapping
    public ResponseEntity<List<AliquotaEntity>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity salvar(@Valid @RequestBody AliquotaEntity filial) throws AliquotaException {
        service.salvar(filial);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{idFilial}")
    public ResponseEntity excluir(@PathVariable("idFilial") Long idFilial) throws Exception {
        service.excluir(idFilial);
        return ResponseEntity.ok().build();
    }

}
