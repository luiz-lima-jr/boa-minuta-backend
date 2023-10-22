package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.MunicipioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMunicipioRepository extends JpaRepository<MunicipioEntity, Long> {

    MunicipioEntity findByCodigoIbge(Long codigoIbge);
}
