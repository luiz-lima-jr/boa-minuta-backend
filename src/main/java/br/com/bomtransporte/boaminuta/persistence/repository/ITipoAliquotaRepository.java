package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.TipoAliquotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoAliquotaRepository extends JpaRepository<TipoAliquotaEntity, Long> {
}
