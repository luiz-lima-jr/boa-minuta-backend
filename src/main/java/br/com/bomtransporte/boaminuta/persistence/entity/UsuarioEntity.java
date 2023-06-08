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
        return funcoes
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getFuncao().getDescricao()))
                .collect(Collectors.toList());
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

    public List<FilialEntity> getFiliaisEntity(){
        return filiais != null ? new ArrayList<>() : filiais.stream().map(f -> f.getFilial()).collect(Collectors.toList());
    }

    public List<FuncaoEntity> getFuncoesEntity(){
        return funcoes != null ? new ArrayList<>() : funcoes.stream().map(f -> f.getFuncao()).collect(Collectors.toList());
    }

     public static class UsuarioEntityBuilder {
        private UsuarioEntity usuario;

        private UsuarioEntityBuilder(UsuarioEntity usuario){

        }

        public static UsuarioEntityBuilder builder(){
            var usuario = new UsuarioEntity();
            usuario.ativo = true;
            usuario.dataCadastro = LocalDateTime.now();
            return new UsuarioEntityBuilder(usuario);
        }

         public UsuarioEntityBuilder nome(String nome) {
             this.usuario.nome = nome;
             return this;
         }
         public UsuarioEntityBuilder email(String email) {
             this.usuario.email = email;
             return this;
         }
         public UsuarioEntityBuilder senha(String senha) {
             this.usuario.senha = senha;
             return this;
         }

         public UsuarioEntityBuilder funcoes(List<FuncaoEntity> rolesCadastro){
             this.usuario.funcoes = new ArrayList<>();
             rolesCadastro.forEach(r -> this.usuario.funcoes.add(new UsuarioFuncaoEntity(null, usuario, r)));
             return this;
         }

         public UsuarioEntityBuilder filiais(List<FilialEntity> filiais){
             this.usuario.filiais = new ArrayList<>();
             filiais.forEach(r -> this.usuario.filiais.add(new UsuarioFilialEntity(null, usuario, r)));
             return this;
         }

         public UsuarioEntity build(){
             return usuario;
         }
    }
}
