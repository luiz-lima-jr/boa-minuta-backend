package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String email;

    @NotNull
    private String senha;

    @NotNull
    private boolean ativo;

    @NotNull
    private LocalDateTime dataCadastro;

    private UUID tokenRecuperarSenha;

    private Long usuarioCadastroId;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<UsuarioFuncaoEntity> funcoes;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<UsuarioFilialEntity> filiais;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<TokenEntity> tokens;

    @Override
    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = funcoes
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getFuncao().getDescricao()))
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
    public UsuarioEntity email(String email) {
        this.email = email;
        return this;
    }
    public UsuarioEntity senha(String senha) {
        this.senha = senha;
        return this;
    }

    public UsuarioEntity funcoes(List<FuncaoEntity> rolesCadastro){
        this.funcoes = new ArrayList<>();
        rolesCadastro.forEach(r -> this.funcoes.add(new UsuarioFuncaoEntity(null, this, r)));
        return this;
    }

    public UsuarioEntity filiais(List<FilialEntity> filiais){
        this.filiais = new ArrayList<>();
        filiais.forEach(r -> this.filiais.add(new UsuarioFilialEntity(null, this, r)));
        return this;
    }


    public UsuarioEntity build(){
        return this;
    }
}
