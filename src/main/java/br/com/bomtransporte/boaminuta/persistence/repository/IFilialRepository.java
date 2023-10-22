package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFilialRepository extends JpaRepository<FilialEntity, Long> {

    FilialEntity findByCodigoMili(Long codigoMili);

    List<FilialEntity> findAllByIdIn(List<Long> ids);
}
