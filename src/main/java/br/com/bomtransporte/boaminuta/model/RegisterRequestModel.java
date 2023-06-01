package br.com.bomtransporte.boaminuta.model;

import br.com.bomtransporte.boaminuta.persistence.entity.RoleEntity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import java.util.List;


@Validated
public class RegisterRequestModel {

    @NotNull
    private String nome;

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    @NotEmpty
    private List<RoleEntity> roles;

    @NonNull
    public String getNome() {
        return nome;
    }

    public void setNome(@NonNull String nome) {
        this.nome = nome;
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public List<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(@NonNull List<RoleEntity> role) {
        this.roles = role;
    }
}