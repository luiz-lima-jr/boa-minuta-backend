package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.ClienteFreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface IPedidoRepository extends JpaRepository<PedidoEntity, Long> {
    List<PedidoEntity> findByFreteId(Long freteId);

}
