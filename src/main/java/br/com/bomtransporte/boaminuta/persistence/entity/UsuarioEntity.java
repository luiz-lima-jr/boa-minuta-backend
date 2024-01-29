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
import java.util.Objects;
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

    private String tokenRecuperarSenha;

    private Long usuarioCadastroId;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<UsuarioFuncaoEntity> funcoes;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
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
        return filiais == null ? new ArrayList<>() : filiais.stream().map(f -> f.getFilial()).collect(Collectors.toList());
    }

    public List<FuncaoEntity> getFuncoesEntity(){
        return funcoes == null ? new ArrayList<>() : funcoes.stream().map(f -> f.getFuncao()).collect(Collectors.toList());
    }

    public void setFuncoes(List<FuncaoEntity> rolesCadastro){
        if(this.funcoes == null){
            this.funcoes = new ArrayList<>();
        }
        if(rolesCadastro == null){
            rolesCadastro  = new ArrayList<>();
        }
        this.funcoes.clear();
        rolesCadastro.forEach(r -> this.funcoes.add(new UsuarioFuncaoEntity(null, this, r)));
    }

    public void setFiliais(List<FilialEntity> filiais){
        if(this.filiais == null){
            this.filiais = new ArrayList<>();
        }
        if(filiais == null){
            filiais = new ArrayList<>();
        }
        this.filiais.clear();
        filiais.forEach(r -> this.filiais.add(new UsuarioFilialEntity(null, this, r)));
    }

    public boolean isAdministrador(){
        return funcoes.stream().filter(f -> f.getFuncao().getDescricao().equals(FuncaoEnum.ADMINISTRADOR.getDescricao())).count() > 0;
    }

    public boolean isFaturista(){
        return funcoes.stream().filter(f -> f.getFuncao().getDescricao().equals(FuncaoEnum.FATURISTA.getDescricao())).count() > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email);
    }

    public static class UsuarioEntityBuilder {
        private UsuarioEntity usuario;

        private UsuarioEntityBuilder(UsuarioEntity usuario){
            this.usuario = usuario;
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
             usuario.setFuncoes(rolesCadastro);
             return this;
         }

         public UsuarioEntityBuilder filiais(List<FilialEntity> filiais){
            usuario.setFiliais(filiais);
            return this;
         }

         public UsuarioEntity build(){
             return usuario;
         }


    }
}
