package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    @Query("SELECT u FROM br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity u WHERE u.username LIKE :login or u.email LIKE :login")
    Optional<UsuarioEntity> findByUserLogin(String login);

    Optional<UsuarioEntity> findByEmail(String email);
}
