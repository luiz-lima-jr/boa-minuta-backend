package br.com.bomtransporte.boaminuta.persistenceMili.repository;

import br.com.bomtransporte.boaminuta.persistenceMili.entity.DetalheCargaArquivoEntity;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface IDetalheCargaArquivoRepository extends JpaRepository<DetalheCargaArquivoEntity, Long> {

    @Query("SELECT c FROM br.com.bomtransporte.boaminuta.persistenceMili.entity.DetalheCargaArquivoEntity c WHERE c.eftCodigo = :codigoFilial AND c.codigoCarga = :codigoCarga  ORDER BY c.dataRecebimento DESC  ")
    List<DetalheCargaArquivoEntity> findByEftCodigoAndCodigoCargaOrderByIdDesc(Long codigoFilial, Long codigoCarga);

//    @Query("SELECT c.id FROM br.com.bomtransporte.boaminuta.persistenceMili.entity.DetalheCargaArquivoEntity c WHERE c.eftCodigo = :codigoFilial AND c.id > :id AND  CONVERT(datetime, c.dataLiberacaoFaturamento, 121)  >= :dataLiberacao ")
    default List<Long> findIdsByEftCodigoAndIdGreaterThanAndDataLiberacaoFaturamentoGreaterThan(Long codigoFilial, Long id, LocalDateTime dataLiberacao, EntityManager entityManager) {
        StringBuilder query = new StringBuilder(" SELECT  SEQ_XML_MILI_CARGAS from VW_XML_MILI_CARGAS WHERE EFTCODIGO = :codigoFilial AND SEQ_XML_MILI_CARGAS > :id AND CAST(DTLIBERACAOFATURAMENTO AS DateTime) >= :dataLiberacao");
        var tp = entityManager.createNativeQuery(query.toString(), Long.class);
        tp.setParameter("codigoFilial", codigoFilial);
        tp.setParameter("id", id);
        tp.setParameter("dataLiberacao", dataLiberacao);
        return tp.getResultList();
    }




}
