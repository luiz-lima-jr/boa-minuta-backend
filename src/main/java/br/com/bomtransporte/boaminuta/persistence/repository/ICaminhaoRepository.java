package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.CaminhaoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICaminhaoRepository extends JpaRepository<CaminhaoEntity, Long> {
    List<CaminhaoEntity> findByPlacaLike(String placa);
}
