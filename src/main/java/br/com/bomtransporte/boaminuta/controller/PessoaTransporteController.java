package br.com.bomtransporte.boaminuta.controller;


import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.persistence.entity.PessoaTransporteEntity;
import br.com.bomtransporte.boaminuta.service.PessoaTransporteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "pessoa-transporte")
public class PessoaTransporteController {

    @Autowired
    private PessoaTransporteService service;

    @GetMapping
    public ResponseEntity<List<PessoaTransporteEntity>> filtrarPorNome(@RequestParam String nome) {
        return ResponseEntity.ok(service.filtrarPorNome(nome));
    }

    @PostMapping
    public ResponseEntity salvar(@Valid @RequestBody PessoaTransporteEntity pessoaTransporteEntity) {
        service.salvar(pessoaTransporteEntity);
        return ResponseEntity.ok().build();
    }
}
