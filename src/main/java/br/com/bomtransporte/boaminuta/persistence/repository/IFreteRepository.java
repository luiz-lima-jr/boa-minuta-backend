package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface IFreteRepository extends JpaRepository<FreteEntity, Long> {

    List<FreteEntity> findAllByFilialIdIn(List<Long> numeros);
    FreteEntity findByNumeroCargaAndFilialId(Long numeroCarga, Long idFilial);

    default List<FreteEntity> findByFiltroFretesCalculados(FreteFiltro filtro, EntityManager entityManager) {
        filtro.setFreteCalculado(true);
        return findByFiltro(filtro, entityManager);
    }
    default Long countByFiltro(FreteFiltro filtro, EntityManager entityManager) {
        StringBuilder query = new StringBuilder("SELECT count(f) FROM br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity f WHERE f.id != null ");
        Map<String, Object> params = montarFiltro(filtro, query);

        var tp = entityManager.createQuery(query.toString(), Long.class);

        for(String key : params.keySet()){
            tp.setParameter(key, params.get(key));
        }

        return tp.getSingleResult();
    }
    default List<FreteEntity> findByFiltro(FreteFiltro filtro, EntityManager entityManager){
        StringBuilder query = new StringBuilder("SELECT f FROM br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity f WHERE f.id != null ");
        Map<String, Object> params = montarFiltro(filtro, query);

        var tp = entityManager.createQuery(query.toString(), FreteEntity.class);

        for(String key : params.keySet()){
            tp.setParameter(key, params.get(key));
        }
        tp.setMaxResults(filtro.getQtdPagina() == 0 ? 100 : filtro.getQtdPagina());
        tp.setFirstResult(filtro.getPagina() * filtro.getQtdPagina());

        return tp.getResultList();
    }

    private Map<String, Object> montarFiltro(FreteFiltro filtro, StringBuilder query) {
        Map<String, Object> params = new HashMap<>();
        boolean todasFilias = filtro.getFiliais() == null || filtro.getFiliais().stream().anyMatch(f -> f.getId().equals(0L));

        if(todasFilias || !filtro.getFiliais().isEmpty()){
            query.append(" AND f.filial.id IN (:filiais) ");
            params.put("filiais", filtro.getFiliais().stream().map(f -> f.getId()).collect(Collectors.toList()));
        }
        if(filtro.getDataInicioFaturamento() != null){
            query.append(" AND f.dataLiberacaoFaturamento <= :inicio ");
            params.put("inicio", filtro.getDataInicioFaturamento());
        }
        if(filtro.getDataFimFaturamento() != null){
            query.append(" AND f.dataLiberacaoFaturamento >= :fim ");
            params.put("fim", filtro.getDataFimFaturamento());
        }
        if(filtro.getResponsaveis() != null && !filtro.getResponsaveis().isEmpty()){
            query.append(" AND f.responsavelOperacional.id IN (:responsaveis) ");
            params.put("responsaveis", filtro.getResponsaveis().stream().map(f -> f.getId()).collect(Collectors.toList()));
        }
        if(filtro.getNumeroCarga() != null){
            query.append(" AND f.numeroCarga = :numeroCarga");
            params.put("numeroCarga", filtro.getNumeroCarga());
        }

        if(filtro.getComPlaca() != null  && filtro.getComPlaca()){
            query.append(" AND f.placa != null ");
        }
        if(filtro.getSemPlaca() != null && filtro.getSemPlaca()){
            query.append(" AND f.placa == null ");
        }

        if(filtro.getFaturadas() != null && filtro.getFaturadas()){
            query.append(" AND f.faturado == true ");
        }
        if(filtro.isFreteCalculado()){
            query.append(" AND f.freteCalculado = true");
        }

        String coluna = filtro.getColuna() == null ? "numeroCarga" : filtro.getColuna();
        String direcao = filtro.getDirecao() == null ? " DESC" : filtro.getDirecao();
        query.append(" ORDER BY f.").append(coluna).append(" ").append(direcao);

        return params;
    }
    default List<UsuarioModel> buscarResponstaveisOperacional(EntityManager entityManager) {
        StringBuilder query = new StringBuilder("SELECT distinct new br.com.bomtransporte.boaminuta.model.UsuarioModel(")
                .append("f.responsavelOperacional.id,")
                .append("f.responsavelOperacional.nome)")
                .append("  FROM br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity f WHERE 1=1 ");
        var tp = entityManager.createQuery(query.toString(), UsuarioModel.class);

        return tp.getResultList();
    }

}
