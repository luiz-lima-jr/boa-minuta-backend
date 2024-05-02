package br.com.bomtransporte.boaminuta.service.relatorio;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.model.relatorio.FiltroRelatorios;
import br.com.bomtransporte.boaminuta.model.relatorio.IndicadorDesempenhoFreteResponsavel;
import br.com.bomtransporte.boaminuta.model.relatorio.RelatorioIndicadorDesempenhoFretes;
import br.com.bomtransporte.boaminuta.model.relatorio.RelatorioIndicadorDesempenhoMarkup;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RelatorioIndicadorDesempenhoMarkupService extends BaseRelatorioService {

    public List<RelatorioIndicadorDesempenhoMarkup> buscarPorFiltro(FiltroRelatorios filtro) throws BoaMinutaBusinessException {
        var fretes = freteRepository.findByFiltro(filtro, entityManager);
        List<RelatorioIndicadorDesempenhoMarkup> relatorio = new ArrayList<>();
        Map<UsuarioEntity, List<FreteEntity>> groupResponsaveis = fretes.stream().collect(Collectors.groupingBy(FreteEntity::getResponsavelOperacional));
        List<IndicadorDesempenhoFreteResponsavel> indicadores = new ArrayList<>();
        for(var key : groupResponsaveis.keySet()) {
            var fretesResponsavel = groupResponsaveis.get(key);
            var indicador = montarIndicador(key, fretesResponsavel);
            indicadores.add(indicador);
        }
        //relatorio.add(indicadores);
        return relatorio;
    }

    private IndicadorDesempenhoFreteResponsavel montarIndicador(UsuarioEntity key, List<FreteEntity> fretesResponsavel){
        var indicador = new IndicadorDesempenhoFreteResponsavel(new UsuarioModel(key.getId(), key.getNome()));
        for(var frete : fretesResponsavel) {
            addIndicadorResponsavel(indicador, frete);
        }
        return indicador;
    }


    private void addIndicadorResponsavel(IndicadorDesempenhoFreteResponsavel indicador, FreteEntity frete){
        indicador.addCargas(1);
        indicador.addM3(frete.getM3());
        indicador.addFretes(frete.getFrete());
        indicador.addComplemento(frete.getComplementoCalculo());
        indicador.addFretePago(frete.getFretePago());
        indicador.addSomaImpostos(frete.totalImpostos());
        indicador.addPedagio(frete.getPedagio());
    }



}
