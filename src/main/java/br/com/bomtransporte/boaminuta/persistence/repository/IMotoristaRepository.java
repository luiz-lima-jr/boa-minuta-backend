package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.persistence.entity.MotoristaEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.PessoaTransporteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMotoristaRepository extends JpaRepository<MotoristaEntity, Long> {

}