package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.MunicipioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMunicipioRepository extends JpaRepository<MunicipioEntity, Long> {

    MunicipioEntity findByCodigoIbge(Long codigoIbge);
    List<MunicipioEntity> findByEstadoId(Long idEstado);
}
