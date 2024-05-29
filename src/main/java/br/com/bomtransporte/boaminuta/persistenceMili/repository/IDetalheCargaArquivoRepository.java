package br.com.bomtransporte.boaminuta.persistenceMili.repository;

import br.com.bomtransporte.boaminuta.persistenceMili.entity.DetalheCargaArquivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDetalheCargaArquivoRepository extends JpaRepository<DetalheCargaArquivoEntity, Long> {

    @Query("SELECT c FROM br.com.bomtransporte.boaminuta.persistenceMili.entity.DetalheCargaArquivoEntity c WHERE c.eftCodigo = :codigoFilial AND c.codigoCarga = :codigoCarga  ORDER BY c.dataRecebimento DESC  ")
    List<DetalheCargaArquivoEntity> findByEftCodigoAndCodigoCargaOrderByIdDesc(Long codigoFilial, Long codigoCarga);

    @Query("SELECT c.id FROM br.com.bomtransporte.boaminuta.persistenceMili.entity.DetalheCargaArquivoEntity c WHERE c.eftCodigo = :codigoFilial AND c.id > :id  ")
    List<Long> findIdsByEftCodigoAndIdGreaterThan(Long codigoFilial, Long id);


}
