package br.com.bomtransporte.boaminuta.service.relatorio;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.model.relatorio.IndicadorDesempenhoResponsavelModel;
import br.com.bomtransporte.boaminuta.model.relatorio.RelatorioIndicadorDesempenhoFretesModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RelatorioIndicadorDesempenhoFreteService extends BaseRelatorioService {


    public RelatorioIndicadorDesempenhoFretesModel buscarPorFiltro(FreteFiltro filtro) throws BoaMinutaBusinessException {
        var fretes = freteRepository.findByFiltroFretesCalculados(filtro, entityManager);
        RelatorioIndicadorDesempenhoFretesModel relatorio = new RelatorioIndicadorDesempenhoFretesModel();
        Map<UsuarioEntity, List<FreteEntity>> groupResponsaveis = fretes.stream().collect(Collectors.groupingBy(FreteEntity::getResponsavelOperacional));
        List<IndicadorDesempenhoResponsavelModel> indicadores = new ArrayList<>();
        for(var key : groupResponsaveis.keySet()) {
            var fretesResponsavel = groupResponsaveis.get(key);
            var indicador = montarIndicador(relatorio, key, fretesResponsavel);
            indicadores.add(indicador);
        }
        relatorio.setList(indicadores);
        return relatorio;
    }

    private IndicadorDesempenhoResponsavelModel montarIndicador(RelatorioIndicadorDesempenhoFretesModel relatorio, UsuarioEntity key, List<FreteEntity> fretesResponsavel){
        var indicador = new IndicadorDesempenhoResponsavelModel(new UsuarioModel(key.getId(), key.getNome()));
        for(var frete : fretesResponsavel) {
            addIndicadorResponsavel(indicador, frete);
            relatorio.addTotalCargas(1);
            relatorio.addTotalM3(frete.getM3());
            relatorio.addTotalFrete(frete.getFrete());
            relatorio.addTotalComplemento(frete.getComplementoCalculo());
            relatorio.addTotalFretePago(frete.getFretePago());
            relatorio.addTotalSomaImpostos(frete.totalImpostos());
            relatorio.addTotalPedagio(frete.getPedagio());
        }
        return indicador;
    }


    private void addIndicadorResponsavel(IndicadorDesempenhoResponsavelModel indicador, FreteEntity frete){
        indicador.addCargas(1);
        indicador.addM3(frete.getM3());
        indicador.addFretes(frete.getFrete());
        indicador.addComplemento(frete.getComplementoCalculo());
        indicador.addFretePago(frete.getFretePago());
        indicador.addSomaImpostos(frete.totalImpostos());
        indicador.addPedagio(frete.getPedagio());
    }



}
