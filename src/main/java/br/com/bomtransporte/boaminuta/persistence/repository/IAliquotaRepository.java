package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.AliquotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAliquotaRepository extends JpaRepository<AliquotaEntity, Long> {

    AliquotaEntity findByEstadoOrigemIdAndEstadoDestinoIdAndTipoAliquotaId(Long idOrigem, Long idDestino, Long idTipoAliquota);
    AliquotaEntity findByFilialIdAndTipoAliquotaId(Long idFilial, Long idTipoAliquota);

}
