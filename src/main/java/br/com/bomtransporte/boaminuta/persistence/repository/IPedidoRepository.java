package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.ClienteFreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IPedidoRepository extends JpaRepository<PedidoEntity, Long> {
    Set<PedidoEntity> findByFreteId(Long freteId);

}
