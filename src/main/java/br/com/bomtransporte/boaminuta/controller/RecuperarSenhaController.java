package br.com.bomtransporte.boaminuta.controller;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "recuperar-senha")
public class RecuperarSenhaController {

    @Autowired
    private UsuarioService usuarioService;


    @PutMapping("{idUsuario}")
    public void recuperarSenhaAdm(@PathVariable("idUsuario") Long idUsuario){
        usuarioService.recuperarSenha(idUsuario);
    }

    @PutMapping
    public void recuperarEmail(@RequestBody String email){
        usuarioService.recuperarSenha(email);
    }

}
