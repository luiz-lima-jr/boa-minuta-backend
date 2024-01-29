package br.com.bomtransporte.boaminuta.persistenceMili.repository;

import br.com.bomtransporte.boaminuta.persistenceMili.entity.CargasDisponiveisArquivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConsultarCargasDisponiveisArquivoRepository extends JpaRepository<CargasDisponiveisArquivoEntity, Long> {

    CargasDisponiveisArquivoEntity findTopByCodigoFilialOrderByIdDesc(Long codigoFilial);

}
