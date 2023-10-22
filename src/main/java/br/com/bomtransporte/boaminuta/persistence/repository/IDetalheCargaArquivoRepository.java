package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.DetalheCargaArquivoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalheCargaArquivoRepository extends JpaRepository<DetalheCargaArquivoEntity, Long> {

    DetalheCargaArquivoEntity findTopByCodigoFilialAndCodigoCargaOrderByIdDesc(Long codigoFilial, Long codigoCarga);

}
