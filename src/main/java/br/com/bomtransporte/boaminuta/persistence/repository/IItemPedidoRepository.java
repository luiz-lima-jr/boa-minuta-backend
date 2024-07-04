package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.ClienteFreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.ItemPedidoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IItemPedidoRepository extends JpaRepository<ItemPedidoEntity, Long> {
    Set<ItemPedidoEntity> findByPedidoId(Long pedidoId);

}
