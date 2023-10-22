package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.CargasDisponiveisArquivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IConsultarCargasDisponiveisArquivoRepository extends JpaRepository<CargasDisponiveisArquivoEntity, Long> {

    CargasDisponiveisArquivoEntity findTopByCodigoFilialOrderByIdDesc(Long codigoFilial);

}
