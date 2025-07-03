package br.com.bomtransporte.boaminuta.persistence.repository;

import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface IFreteRepository extends JpaRepository<FreteEntity, Long> {

    FreteEntity findByNumeroCargaAndFilialId(Long numeroCarga, Long idFilial);
    @Query("SELECT count(f) FROM br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity f WHERE f.caminhao.motorista.pessoaTransporte.id = :idPessoaTransporte ")
    Long findQtdByPessoaMotoristaId(Long idPessoaTransporte);

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

    default List<Long> findAnos(EntityManager entityManager) {
        StringBuilder query = new StringBuilder("SELECT distinct YEAR(f.dataLiberacaoFaturamento) FROM br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity f WHERE f.dataLiberacaoFaturamento is not null ");
        var tp = entityManager.createQuery(query.toString(), Long.class);
        return tp.getResultList();
    }

    private Map<String, Object> montarFiltro(FreteFiltro filtro, StringBuilder query) {
        Map<String, Object> params = new HashMap<>();
        boolean todasFilias = filtro.getFiliais() == null || filtro.getFiliais().stream().anyMatch(f -> f.getId().equals(0L));
        query.append(" AND f.faturado =  ").append(filtro.isFaturadas());

        if(filtro.getFiliais() != null  && (todasFilias || (!filtro.getFiliais().isEmpty()))){
            query.append(" AND f.filial.id IN (:filiais) ");
            params.put("filiais", filtro.getFiliais().stream().map(f -> f.getId()).collect(Collectors.toList()));
        }
        if(filtro.getDataInicioFaturamento() != null){
            query.append(" AND f.dataLiberacaoFaturamento >= :inicio ");
            params.put("inicio", filtro.getDataInicioFaturamento().withHour(0).withMinute(0).withSecond(0));
        }
        if(filtro.getDataFimFaturamento() != null){
            query.append(" AND f.dataLiberacaoFaturamento <= :fim ");
            params.put("fim", filtro.getDataFimFaturamento().withHour(23).withMinute(59).withSecond(59));
        }
        if(filtro.getDataInicioCadastro() != null){
            query.append(" AND f.dataCalculo >= :inicioCadastro ");
            params.put("inicioCadastro", filtro.getDataInicioCadastro().withHour(0).withMinute(0).withSecond(0));
        }
        if(filtro.getDataFimCadastro() != null){
            query.append(" AND f.dataCalculo <= :fimCadastro ");
            params.put("fimCadastro", filtro.getDataFimCadastro().withHour(23).withMinute(59).withSecond(59));
        }
        if(filtro.getResponsaveis() != null  && filtro.getResponsaveis() != null && !filtro.getResponsaveis().isEmpty()){
            query.append(" AND f.responsavelOperacional.id IN (:responsaveis) ");
            params.put("responsaveis", filtro.getResponsaveis().stream().map(f -> f.getId()).collect(Collectors.toList()));
        }
        if(filtro.getNumeroCarga() != null){
            query.append(" AND f.numeroCarga = :numeroCarga");
            params.put("numeroCarga", filtro.getNumeroCarga());
        }

        if(filtro.getLancadas() != null  && filtro.getLancadas()){
            query.append(" AND f.dataCalculo is not null ");
        }

        if(filtro.isFreteCalculado()){
            query.append(" AND f.dataCalculo is not null ");
        }
        if(filtro.getExperienciasBom() != null && !filtro.getExperienciasBom().isEmpty()){
            query.append(" AND f.caminhao.motorista.experiencia IN (:experiencia) ");
            params.put("experiencia", filtro.getExperienciasBom());
        }
        if(filtro.getAnoExercicio() != null){
            query.append(" AND f.dataLiberacaoFaturamento IS NOT NULL and YEAR(f.dataLiberacaoFaturamento) = :anoExercicio ");
            params.put("anoExercicio", filtro.getAnoExercicio());
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
