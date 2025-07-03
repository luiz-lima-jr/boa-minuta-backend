package br.com.bomtransporte.boaminuta.controller;


import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.enuns.ExperienciaBomEnum;
import br.com.bomtransporte.boaminuta.persistence.entity.CaminhaoEntity;
import br.com.bomtransporte.boaminuta.service.CaminhaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "caminhao")
public class CaminhaoController {

    @Autowired
    private CaminhaoService service;

    @GetMapping
    public ResponseEntity<List<CaminhaoEntity>> filtrarPorPlaca(@RequestParam String placa) {
        return ResponseEntity.ok(service.filtrarPorPlaca(placa));
    }

    @PostMapping
    public ResponseEntity salvar(@Valid @RequestBody CaminhaoEntity caminhaoEntity) {
        service.salvar(caminhaoEntity);
        return ResponseEntity.ok().build();
    }

    @GetMapping("experiencia")
    public ResponseEntity<ExperienciaBomEnum> getExperiencia(@RequestParam Long idPessoa) {
        return ResponseEntity.ok(service.getExperienciaMotorista(idPessoa));
    }


    @DeleteMapping("{idFilial}")
    public ResponseEntity excluir(@PathVariable("idFilial") Long idFilial) throws Exception {
        return ResponseEntity.ok().build();
    }

}
