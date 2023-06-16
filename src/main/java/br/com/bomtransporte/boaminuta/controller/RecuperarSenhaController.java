package br.com.bomtransporte.boaminuta.controller;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.AlterarSenhaExternoModel;
import br.com.bomtransporte.boaminuta.model.AlterarSenhaModel;
import br.com.bomtransporte.boaminuta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "senha")
public class RecuperarSenhaController {

    @Autowired
    private UsuarioService usuarioService;

    @PutMapping("enviar-link/{idUsuario}")
    public void recuperarSenhaAdm(@PathVariable("idUsuario") Long idUsuario){
        usuarioService.recuperarSenha(idUsuario);
    }

    @PutMapping("alterar-senha")
    public void alterarSenha(@RequestBody AlterarSenhaModel alterarSenhaModel) throws BoaMinutaBusinessException {
        usuarioService.alterarSenha(alterarSenhaModel);
    }
}
