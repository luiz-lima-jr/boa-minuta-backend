package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.adapter.FreteAdapter;
import br.com.bomtransporte.boaminuta.exception.AliquotaException;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FiltroRelatorioMargemOperacional;
import br.com.bomtransporte.boaminuta.model.FreteModel;
import br.com.bomtransporte.boaminuta.model.RelatorioMargemOperacionalModel;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.persistence.repository.IFreteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RelatorioMargemOperacionalService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private IFreteRepository freteRepository;

    @Autowired
    private FreteAdapter freteAdapter;


    public RelatorioMargemOperacionalModel buscarPorFiltro(FiltroRelatorioMargemOperacional filtro) throws BoaMinutaBusinessException {
        //var fretes = freteRepository.findByFiltro(filtro, entityManager);
        var fretes = freteRepository.findByFiltro(filtro, entityManager);
        var totalFrete = 0.0;
        var totalFretePago = 0.0;
        var totalCustos = 0.0;
        var totalSaldo = 0.0;

        var relatorio = new RelatorioMargemOperacionalModel();
        relatorio.setFretes(new ArrayList<>());

        for(var frete : fretes){
            var freteModel = freteAdapter.freteEntityToModel(frete);
            relatorio.getFretes().add(freteModel);
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

    public List<UsuarioModel> buscarResponstaveisOperacional(){
       return freteRepository.buscarResponstaveisOperacional(entityManager);
    }


}
