package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioFilialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IUsuarioFilialRepository extends JpaRepository<UsuarioFilialEntity, Long> {

    Optional<UsuarioFilialEntity> findByUsuarioIdAndFilialId(Long usuarioId, Long filialId);

}
