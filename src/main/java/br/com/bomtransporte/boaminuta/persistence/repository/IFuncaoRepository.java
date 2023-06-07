package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFuncaoRepository extends JpaRepository<FuncaoEntity, Integer> {
}
