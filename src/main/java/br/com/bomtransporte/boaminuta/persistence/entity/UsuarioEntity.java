package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
@Entity(name = "usuario")
public class UsuarioEntity implements UserDetails {

    @Id
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String username;
    private String email;
    private String senha;
    private boolean ativo;
    private LocalDateTime dataCadastro;
    private UUID tokenRecuperarSenha;

    private UUID usuarioCadastroId;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<UsuarioRoleEntity> roles;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<TokenEntity> tokens;

    @Override
    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = roles
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getRole().getName()))
                .collect(Collectors.toList());
        return authorities;
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    public static UsuarioEntity builder(){
        var user = new UsuarioEntity();
        user.ativo = true;
        user.dataCadastro = LocalDateTime.now();
        return user;
    }

    public UsuarioEntity nome(String nome) {
        this.nome = nome;
        return this;
    }
    public UsuarioEntity login(String login) {
        this.username = login;
        return this;
    }
    public UsuarioEntity email(String email) {
        this.email = email;
        return this;
    }
    public UsuarioEntity senha(String senha) {
        this.senha = senha;
        return this;
    }

    public UsuarioEntity roles(List<RoleEntity> rolesCadastro){
        this.roles = new ArrayList<>();
        rolesCadastro.forEach(r -> this.roles.add(new UsuarioRoleEntity(null, this, r)));
        return this;
    }


    public UsuarioEntity build(){
        return this;
    }
}
