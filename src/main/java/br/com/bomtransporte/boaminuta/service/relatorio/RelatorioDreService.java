package br.com.bomtransporte.boaminuta.service.relatorio;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.model.relatorio.DreValoresModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RelatorioDreService  extends BaseRelatorioService {
    String meses[] = {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL",  "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};
    @Override
    public List<DreValoresModel> buscarPorFiltro(FreteFiltro filtro) throws BoaMinutaBusinessException {
        //filtro.setFreteCalculado(true);
        var fretes = freteRepository.findByFiltroFretesCalculados(filtro, entityManager);
        List<DreValoresModel> dres = new ArrayList<>();
        if(filtro.getDataInicioFaturamento() != null && filtro.getDataFimFaturamento() != null){
            var dre = DreValoresModel.calcularValores(fretes);
            dre.setNomeMes("PERÍODO");
            dres.add(dre);
            popularMeses(dres);
        } else {
            dres = popularExercicio(fretes);
        }

        return dres;
    }

    private List<DreValoresModel> popularExercicio(List<FreteEntity> fretes){
        var group = fretes.stream().collect(Collectors.groupingBy(f -> f.getDataLiberacaoFaturamento().getMonthValue()));
        List<DreValoresModel> dres = new ArrayList<>();
        for(Integer mes : group.keySet()){
            var fretesMes = group.get(mes);
            var dre = DreValoresModel.calcularValores(fretesMes);
            dre.setMes(mes);
            dre.setNomeMes(this.meses[mes - 1]);
            dres.add(dre);
        }
        popularMeses(dres);
        dres.sort(Comparator.comparing(DreValoresModel::getMes));
        return dres;
    }

    public List<Long> getAnos(){
        return freteRepository.findAnos(entityManager);
    }

    private void popularMeses(List<DreValoresModel> dres){
        for(int i = 0; i < this.meses.length; i++){
            int mesValor = i + 1;
            if(dres.stream().noneMatch(d -> d.getMes() == mesValor)){
                var dre = new DreValoresModel();
                dre.setMes(mesValor);
                dre.setNomeMes(meses[i]);
                dres.add(dre);
            }
        }
    }

}
