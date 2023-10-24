package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.EstadoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFreteRepository extends JpaRepository<FreteEntity, Long> {

    List<FreteEntity> findAllByFilialIdIn(List<Long> numeros);
    FreteEntity findByNumeroCargaAndFilialId(Long numeroCarga, Long idFilial);


}
