package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.ClienteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.ClienteFreteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IClienteFreteRepository extends JpaRepository<ClienteFreteEntity, Long> {

    Set<ClienteFreteEntity> findByFreteId(Long freteId);
}
