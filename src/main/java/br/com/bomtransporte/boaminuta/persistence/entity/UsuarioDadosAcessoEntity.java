package br.com.bomtransporte.boaminuta.persistence.entity;

import br.com.bomtransporte.boaminuta.enuns.FuncaoEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Entity(name = "usuario_dados_acesso")
public class UsuarioDadosAcessoEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    @NotNull
    private String senha;

    @Column(name = "token_recuperar_senha")
    private String tokenRecuperarSenha;


    @OneToMany(mappedBy = "usuarioDadosAcesso", cascade = CascadeType.ALL)
    private List<TokenEntity> tokens;

    @Override
    public List<SimpleGrantedAuthority> getAuthorities() {
        return usuario.getFuncoesEntity()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getDescricao()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return senha;
    }


    @Override
    public String getUsername() {
        return usuario.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return usuario.isAtivo();
    }

    @Override
    public boolean isAccountNonLocked() {
        return usuario.isAtivo();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return usuario.isAtivo();
    }

    @Override
    public boolean isEnabled() {
        return usuario.isAtivo();
    }


    public static class UsuarioDadosAcessoEntityBuilder {
        private UsuarioDadosAcessoEntity usuarioDados;

        private UsuarioDadosAcessoEntityBuilder(UsuarioDadosAcessoEntity usuario){
            this.usuarioDados = usuario;
        }

        public static UsuarioDadosAcessoEntityBuilder builder(){
            var usuario = new UsuarioEntity();
            usuario.setAtivo(true);
            usuario.setDataCadastro(LocalDateTime.now());

            var usuarioDados = new UsuarioDadosAcessoEntity();
            usuarioDados.setUsuario(usuario);

            return new UsuarioDadosAcessoEntityBuilder(usuarioDados);
        }

        public UsuarioDadosAcessoEntityBuilder nome(String nome) {
            this.usuarioDados.getUsuario().setNome(nome);
            return this;
        }
        public UsuarioDadosAcessoEntityBuilder email(String email) {
            this.usuarioDados.getUsuario().setEmail(email);
            return this;
        }
        public UsuarioDadosAcessoEntityBuilder senha(String senha) {
            this.usuarioDados.senha = senha;
            return this;
        }

        public UsuarioDadosAcessoEntityBuilder funcoes(List<FuncaoEntity> rolesCadastro){
            this.usuarioDados.getUsuario().setFuncoes(rolesCadastro);
            return this;
        }

        public UsuarioDadosAcessoEntityBuilder filiais(List<FilialEntity> filiais){
            this.usuarioDados.getUsuario().setFiliais(filiais);
            return this;
        }

        public UsuarioDadosAcessoEntity build(){
            return usuarioDados;
        }


    }

}
