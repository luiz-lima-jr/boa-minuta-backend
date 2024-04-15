package br.com.bomtransporte.boaminuta.persistenceMili.repository;

import br.com.bomtransporte.boaminuta.persistenceMili.entity.CargasDisponiveisArquivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface IConsultarCargasDisponiveisArquivoRepository extends JpaRepository<CargasDisponiveisArquivoEntity, Long> {

    @Query("SELECT c FROM br.com.bomtransporte.boaminuta.persistenceMili.entity.CargasDisponiveisArquivoEntity c WHERE c.codigoFilial = :codigoFilial AND id NOT IN (:idsConsultados) ")
    List<CargasDisponiveisArquivoEntity> findByCodigoFilialAndIds(Long codigoFilial, List<Long> idsConsultados);

    @Query("SELECT c FROM br.com.bomtransporte.boaminuta.persistenceMili.entity.CargasDisponiveisArquivoEntity c WHERE c.codigoFilial = :codigoFilial AND c.dataRegistro >= :dataHoje ORDER BY c.dataRegistro DESC ")
    List<CargasDisponiveisArquivoEntity> findByCodigoFilial(Long codigoFilial, LocalDateTime dataHoje);

}
