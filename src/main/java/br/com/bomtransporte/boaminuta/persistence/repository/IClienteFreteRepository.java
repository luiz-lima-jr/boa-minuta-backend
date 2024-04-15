package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.ClienteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.ClienteFreteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteFreteRepository extends JpaRepository<ClienteFreteEntity, Long> {
}
