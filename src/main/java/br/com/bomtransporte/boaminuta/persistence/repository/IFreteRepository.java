package br.com.bomtransporte.boaminuta.persistence.repository;

//import br.com.bomtransporte.boaminuta.model.FiltroRelatorioMargemOperacional;
import br.com.bomtransporte.boaminuta.model.FiltroRelatorioMargemOperacional;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.entity.EstadoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFreteRepository extends JpaRepository<FreteEntity, Long> {

    List<FreteEntity> findAllByFilialIdIn(List<Long> numeros);
    FreteEntity findByNumeroCargaAndFilialId(Long numeroCarga, Long idFilial);


/*    default List<FreteEntity> findByFiltro(FiltroRelatorioMargemOperacional filtro, EntityManager entityManager){
        StringBuilder query = new StringBuilder("SELECT f FROM br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity f WHERE 1=1 ");

        if(filtro.getFiliais() != null && !filtro.getFiliais().isEmpty()){
            query.append(" f.filial.id IN (:filiais) ");
        }
        if(filtro.getInicio() != null){
            query.append(" f.dataLiberacaoFaturamento <= :inicio ");
        }
        if(filtro.getFim() != null){
            query.append(" f.dataLiberacaoFaturamento >= :fim ");
        }
        if(filtro.getResponsaveis() != null && !filtro.getResponsaveis().isEmpty()){
            query.append(" f.responsavelOperacional.id IN (:responsaveis) ");
        }

        var tp = entityManager.createQuery(query.toString(), FreteEntity.class);
        if(filtro.getFiliais() != null && !filtro.getFiliais().isEmpty()){
            tp.setParameter("filiais", filtro.getFiliais());
        }
        if(filtro.getInicio() != null){
            tp.setParameter("inicio", filtro.getInicio());
        }
        if(filtro.getFim() != null){
            tp.setParameter("fim", filtro.getFim());
        }
        if(filtro.getResponsaveis() != null && !filtro.getResponsaveis().isEmpty()){
            tp.setParameter("responsaveis", filtro.getResponsaveis());
        }
        return tp.getResultList();
    }

    default List<UsuarioModel> buscarResponstaveisOperacional(EntityManager entityManager) {
        StringBuilder query = new StringBuilder("SELECT distinct new br.com.bomtransporte.boaminuta.model.UsuarioModel(")
                .append("f.responsavelOperacional.id,")
                .append("f.responsavelOperacional.nome)")
                .append("  FROM br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity f WHERE 1=1 ");
        var tp = entityManager.createQuery(query.toString(), UsuarioModel.class);

        return tp.getResultList();
    }
*/
}
