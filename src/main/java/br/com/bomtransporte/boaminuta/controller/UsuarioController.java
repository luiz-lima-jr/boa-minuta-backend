package br.com.bomtransporte.boaminuta.controller;


import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.UsuarioException;
import br.com.bomtransporte.boaminuta.exception.UsuarioExistenteException;
import br.com.bomtransporte.boaminuta.model.RegistroUsuarioModel;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import br.com.bomtransporte.boaminuta.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity register(@Valid @RequestBody RegistroUsuarioModel request) throws UsuarioExistenteException, UsuarioException {
        try {
            usuarioService.cadastrarUsuario(request);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (UsuarioExistenteException e ){
            throw e;
        } catch (Exception e){
            throw new UsuarioException("Não foi possível salvar o usuário");
        }
    }

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
