package br.com.bomtransporte.boaminuta.service.relatorio;

import br.com.bomtransporte.boaminuta.adapter.FreteAdapter;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.model.relatorio.RelatorioMargemOperacionalModel;
import br.com.bomtransporte.boaminuta.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RelatorioMargemOperacionalService extends BaseRelatorioService {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private FreteAdapter freteAdapter;


    public RelatorioMargemOperacionalModel buscarPorFiltro(FreteFiltro filtro) throws BoaMinutaBusinessException {
        var fretes = freteRepository.findByFiltroFretesCalculados(filtro, entityManager);
        var totalFrete = 0.0;
        var totalFretePago = 0.0;
        var totalCustos = 0.0;
        var totalSaldo = 0.0;

        var relatorio = new RelatorioMargemOperacionalModel();
        relatorio.setList(new ArrayList<>());

        for(var frete : fretes){
            var freteModel = freteAdapter.freteEntityToModel(frete);
            relatorio.getList().add(freteModel);
            totalFrete += freteModel.getFrete();
            totalFretePago += freteModel.getFretePago();
            totalCustos += freteModel.getCustos();
            totalSaldo += freteModel.getSaldo();
        }

        relatorio.setTotalCustos(totalCustos);
        relatorio.setTotalFrete(totalFrete);
        relatorio.setTotalSaldo(totalSaldo);
        relatorio.setTotalFretePago(totalFretePago);

        return relatorio;
    }



}
