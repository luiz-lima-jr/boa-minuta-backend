package br.com.bomtransporte.boaminuta.controller;

import br.com.bomtransporte.boaminuta.config.Constantes;
import br.com.bomtransporte.boaminuta.exception.UsuarioExistenteException;
import br.com.bomtransporte.boaminuta.model.AutenticacaoRequestModel;
import br.com.bomtransporte.boaminuta.model.AutenticacaoResponseModel;
import br.com.bomtransporte.boaminuta.model.RegistroUsuarioModel;
import br.com.bomtransporte.boaminuta.model.SessionModel;
import br.com.bomtransporte.boaminuta.service.AuthenticationService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(Constantes.VERSAO_API_URL + "auth")
public class AuthenticationController {

    public AuthenticationController(){
        int i = 0;
    }

    @Autowired
    private AuthenticationService service;


    @PostMapping
    public ResponseEntity<AutenticacaoResponseModel> authenticate(
            @Validated @RequestBody AutenticacaoRequestModel request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }

    @DeleteMapping("logout")
    public ResponseEntity<AutenticacaoResponseModel> logout() {
        service.logout();
        return ResponseEntity.ok().build();
    }

    @PostMapping("/refresh-token")
    public void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        service.refreshToken(request, response);
    }



}
