package br.com.bomtransporte.boaminuta.model;

import lombok.Data;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;

@Data
public class SessionModel {
    private String nome;
    private String emaill;
    private List<String> roles;
}
