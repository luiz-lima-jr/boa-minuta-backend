package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.CargasConsultadas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICargasConsultadasRepository extends JpaRepository<CargasConsultadas, Long> {

    Optional<CargasConsultadas> findFirstByFreteFilialIdOrderByIdViewDesc(Long idFilial);
}
