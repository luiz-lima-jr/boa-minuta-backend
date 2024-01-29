package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.enuns.TokenTypeEnum;
import br.com.bomtransporte.boaminuta.model.AutenticacaoRequestModel;
import br.com.bomtransporte.boaminuta.model.AutenticacaoResponseModel;
import br.com.bomtransporte.boaminuta.model.SessionModel;
import br.com.bomtransporte.boaminuta.persistence.entity.TokenEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.ITokenRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.stream.Collectors;

@Service
public class AuthenticationService {
    @Autowired
    private  UsuarioService usuarioService;
    @Autowired
    private ITokenRepository tokenRepository;
    @Autowired
    private  JwtService jwtService;
    @Autowired
    private  AuthenticationManager authenticationManager;

    public SessionModel getDadosSessao(){
        var session = new SessionModel();
        session.setEmaill(usuarioService.getUserDetails().getEmail());
        session.setNome(usuarioService.getUserDetails().getNome());
        session.setFuncoes(usuarioService.getUserDetails().getAuthorities().stream().map(SimpleGrantedAuthority::getAuthority).collect(Collectors.toList()));

        return session;
    }

    public AutenticacaoResponseModel authenticate(AutenticacaoRequestModel request) {
        var usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                request.getEmail(),
                request.getSenha()
        );
        authenticationManager.authenticate(
                usernamePasswordAuthenticationToken
        );
        var user = usuarioService.getUsuarioByEmail(request.getEmail());
        var jwtToken = jwtService.generateToken(user);
        var refreshToken = jwtService.generateRefreshToken(user);
        revokeAllUserTokens(user);
        saveUserToken(user, jwtToken);
        return AutenticacaoResponseModel.builder()
                .sessionToken(jwtToken)
                .refreshToken(refreshToken)
                .sessionProfile(getDadosSessao())
                .build();
    }

    public void logout(){
        var user = usuarioService.getUserDetails();
        var tokens =  tokenRepository.findAllValidTokenByUser(user.getId());
        tokens.forEach(t -> t.revoke());
        tokenRepository.saveAll(tokens);
    }

    private void saveUserToken(UsuarioEntity user, String jwtToken) {
        var token = TokenEntity.builder()
                .usuario(user)
                .token(jwtToken)
                .tokenType(TokenTypeEnum.BEARER)
                .expired(false)
                .revoked(false)
                .build();
        tokenRepository.save(token);
    }

    private void revokeAllUserTokens(UsuarioEntity user) {
        var validUserTokens = tokenRepository.findAllValidTokenByUser(user.getId());
        if (validUserTokens.isEmpty())
            return;
        validUserTokens.forEach(token -> {
            token.setExpired(true);
            token.setRevoked(true);
        });
        tokenRepository.saveAll(validUserTokens);
    }

    public void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
        final String refreshToken;
        final String userEmail;
        if (authHeader == null ||!authHeader.startsWith("Bearer ")) {
            return;
        }
        refreshToken = authHeader.substring(7);
        userEmail = jwtService.extractUsername(refreshToken);
        if (userEmail != null) {
            var user = this.usuarioService.getUsuarioByEmail(userEmail);
            if (jwtService.isTokenValid(refreshToken, user)) {
                var accessToken = jwtService.generateToken(user);
                revokeAllUserTokens(user);
                saveUserToken(user, accessToken);
                var authResponse = AutenticacaoResponseModel.builder()
                        .sessionToken(accessToken)
                        .refreshToken(refreshToken)
                        .build();
                new ObjectMapper().writeValue(response.getOutputStream(), authResponse);
            }
        }
    }
}