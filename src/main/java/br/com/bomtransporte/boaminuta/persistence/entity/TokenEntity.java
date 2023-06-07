package br.com.bomtransporte.boaminuta.persistence.entity;


import br.com.bomtransporte.boaminuta.enuns.TokenTypeEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "token")
public class TokenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    private UUID id;

    @Column(unique = true)
    @NotNull
    private String token;

    @Enumerated(EnumType.STRING)
    @NotNull
    private TokenTypeEnum tokenType = TokenTypeEnum.BEARER;

    private boolean revoked;

    private boolean expired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    @NotNull
    private UsuarioEntity usuario;

    public void revoke(){
        this.expired = true;
        this.revoked = true;
    }

}