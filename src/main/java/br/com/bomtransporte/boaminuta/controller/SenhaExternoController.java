package br.com.bomtransporte.boaminuta.controller;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.AlterarSenhaExternoModel;
import br.com.bomtransporte.boaminuta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "senha/externo")
public class SenhaExternoController {


    @Autowired
    private UsuarioService usuarioService;


    @PutMapping(value = "alterar-senha", produces="text/plain" )
    public ResponseEntity<String> alterarSenha(@RequestBody AlterarSenhaExternoModel model) throws BoaMinutaBusinessException {
        try {
            usuarioService.alterarSenha(model);
            return ResponseEntity.ok().build();
        }catch (Exception e ){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }


    @PutMapping("recuperar-senha")
    public ResponseEntity recuperarEmail(@RequestBody String email){
        usuarioService.recuperarSenha(email);
        return ResponseEntity.status(200).build();
    }

}
