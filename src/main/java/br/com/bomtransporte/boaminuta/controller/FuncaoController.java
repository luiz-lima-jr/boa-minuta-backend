package br.com.bomtransporte.boaminuta.controller;


import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import br.com.bomtransporte.boaminuta.service.FuncaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "funcao")
public class FuncaoController {

    @Autowired
    private FuncaoService  funcaoService;

    @GetMapping
    public ResponseEntity<List<FuncaoEntity>> getAll() {
        return ResponseEntity.ok(funcaoService.getAll());
    }

}
