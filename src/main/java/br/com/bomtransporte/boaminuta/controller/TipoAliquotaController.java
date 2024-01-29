package br.com.bomtransporte.boaminuta.controller;


import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.persistence.entity.TipoAliquotaEntity;
import br.com.bomtransporte.boaminuta.service.TipoAliquotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "tipo-aliquota")
public class TipoAliquotaController {

    @Autowired
    private TipoAliquotaService service;

    @GetMapping
    public ResponseEntity<List<TipoAliquotaEntity>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

}
