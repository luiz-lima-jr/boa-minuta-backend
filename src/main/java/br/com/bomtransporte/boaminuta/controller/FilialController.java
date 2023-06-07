package br.com.bomtransporte.boaminuta.controller;


import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.service.FilialService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "filial")
public class FilialController {

    @Autowired
    private FilialService service;

    @GetMapping
    public ResponseEntity<List<FilialEntity> > getAll(){
        return ResponseEntity.ok(service.getAll());
    }


    @PostMapping
    public ResponseEntity salvar(@Valid @RequestBody FilialEntity filial) {
        service.salvar(filial);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{idFilial}")
    public ResponseEntity excluir(@PathVariable("idFilial") Long idFilial) throws Exception {
        service.excluir(idFilial);
        return ResponseEntity.ok().build();
    }

}
