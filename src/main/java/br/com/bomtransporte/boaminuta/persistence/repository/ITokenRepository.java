package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ITokenRepository extends JpaRepository<TokenEntity, Integer> {

    @Query(value = """
      select t from br.com.bomtransporte.boaminuta.persistence.entity.TokenEntity t 
      inner join br.com.bomtransporte.boaminuta.persistence.entity.UsuarioDadosAcessoEntity u\s
      on t.usuarioDadosAcesso.id = u.id where u.id = :id and (t.expired = false or t.revoked = false)\s
      """)
    List<TokenEntity> findAllValidTokenByUser(Long id);

    Optional<TokenEntity> findByToken(String token);
}