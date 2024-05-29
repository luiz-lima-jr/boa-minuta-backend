package br.com.bomtransporte.boaminuta.controller;


import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.persistence.entity.EstadoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.MunicipioEntity;
import br.com.bomtransporte.boaminuta.service.EstadoService;
import br.com.bomtransporte.boaminuta.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "municipio")
public class MunicipioController {

    @Autowired
    private MunicipioService service;

    @GetMapping("{idEstado}")
    public ResponseEntity<List<MunicipioEntity>> getPorEstado(@PathVariable("idEstado") Long idEstado) {
        return ResponseEntity.ok(service.buscarPorEstado(idEstado));
    }

}
