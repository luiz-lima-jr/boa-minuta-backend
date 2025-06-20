package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.AliquotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAliquotaRepository extends JpaRepository<AliquotaEntity, Long> {

    AliquotaEntity findByEstadoOrigemIdAndEstadoDestinoIdAndTipoAliquotaIdAndFilialId(Long idOrigem, Long idDestino, Long idTipoAliquota, Long idFiliam);
    AliquotaEntity findByFilialIdAndEstadoDestinoIdAndTipoAliquotaId(Long idOrigem, Long idDestino, Long idTipoAliquota);
    AliquotaEntity findByFilialIdAndTipoAliquotaId(Long idFilial, Long idTipoAliquota);

}
