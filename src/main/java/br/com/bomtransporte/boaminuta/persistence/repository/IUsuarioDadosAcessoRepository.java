package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioDadosAcessoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IUsuarioDadosAcessoRepository extends JpaRepository<UsuarioDadosAcessoEntity, Long> {

    Optional<UsuarioDadosAcessoEntity> findByTokenRecuperarSenha(String tokenRecuperarSenha);

    Optional<UsuarioDadosAcessoEntity> findByUsuarioEmail(String email);
    Optional<UsuarioDadosAcessoEntity> findByUsuarioId(Long id);
}
