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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioId")
    private UsuarioEntity usuario;

    @NotNull
    private String senha;

    @Column(name = "tokenRecuperarSenhaId")
    private String tokenRecuperarSenha;


    @OneToMany(mappedBy = "usuarioDadosAcesso", cascade = CascadeType.ALL)
    private List<TokenEntity> tokens;


    //@ManyToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    @JoinTable(name = "usuario_funcao",
            joinColumns = { @JoinColumn(name = "usuarioId") },
            inverseJoinColumns = {@JoinColumn(name = "funcaoId")}
    )
    private List<FuncaoEntity> funcoes;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    @JoinTable(name = "usuario_filial",
            joinColumns = { @JoinColumn(name = "usuarioId") },
            inverseJoinColumns = {@JoinColumn(name = "filialId")}
    )
    private List<FilialEntity> filiais;

    public List<FuncaoEntity> getFuncoesEntity(){
        return funcoes == null ? new ArrayList<>() : funcoes;
    }
    public List<FilialEntity> getFiliaisEntity(){
        return filiais == null ? new ArrayList<>() : filiais;
    }
    public void setFiliais(List<FilialEntity> filiais){
        if(filiais == null){
            filiais = new ArrayList<>();
        }
        this.filiais = filiais;
    }

    @Override
    public List<SimpleGrantedAuthority> getAuthorities() {
        return funcoes
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



    public void setFuncoes(List<FuncaoEntity> rolesCadastro){
        if(rolesCadastro == null){
            rolesCadastro  = new ArrayList<>();
        }
        this.funcoes = rolesCadastro;
    }

    public boolean isAdministrador(){
        return funcoes.stream().filter(f -> f.getDescricao().equals(FuncaoEnum.ADMINISTRADOR.getDescricao())).count() > 0;
    }

    public boolean isFaturista(){
        return funcoes.stream().filter(f -> f.getDescricao().equals(FuncaoEnum.FATURISTA.getDescricao())).count() > 0;
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
            this.usuarioDados.setFuncoes(rolesCadastro);
            return this;
        }

        public UsuarioDadosAcessoEntityBuilder filiais(List<FilialEntity> filiais){
            this.usuarioDados.setFiliais(filiais);
            return this;
        }

        public UsuarioDadosAcessoEntity build(){
            return usuarioDados;
        }


    }

}
