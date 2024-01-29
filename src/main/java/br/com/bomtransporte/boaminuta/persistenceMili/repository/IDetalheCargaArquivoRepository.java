package br.com.bomtransporte.boaminuta.persistenceMili.repository;

import br.com.bomtransporte.boaminuta.persistenceMili.entity.DetalheCargaArquivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalheCargaArquivoRepository extends JpaRepository<DetalheCargaArquivoEntity, Long> {

    DetalheCargaArquivoEntity findTopByCodigoFilialAndCodigoCargaOrderByIdDesc(Long codigoFilial, Long codigoCarga);

}
