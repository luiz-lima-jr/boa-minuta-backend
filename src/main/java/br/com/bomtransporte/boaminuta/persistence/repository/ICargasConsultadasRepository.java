package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.CargasConsultadas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ICargasConsultadasRepository extends JpaRepository<CargasConsultadas, Long> {

    Optional<CargasConsultadas> findFirstByFreteFilialIdOrFilialIdOrderByIdViewDesc(Long idFilial, Long filialId);
    List<CargasConsultadas> findByFreteId(Long freteId);
}
