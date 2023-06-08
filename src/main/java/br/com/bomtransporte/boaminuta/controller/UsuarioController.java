package br.com.bomtransporte.boaminuta.controller;


import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import br.com.bomtransporte.boaminuta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> getAll() {
        var usuarios = usuarioService.getAll();
        var usuariosModel = usuarios.stream().map(u -> UsuarioModel.builder()
                                                .id(u.getId())
                                                .nome(u.getNome())
                                                .email(u.getEmail())
                                                .filiais(u.getFiliaisEntity())
                                                .funcoes(u.getFuncoesEntity())
                                                .situacao(u.isAtivo())
                                                .build()
                                        ).collect(Collectors.toList());
        return ResponseEntity.ok(usuariosModel);
    }

}
