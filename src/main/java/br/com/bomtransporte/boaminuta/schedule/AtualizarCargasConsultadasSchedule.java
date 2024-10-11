package br.com.bomtransporte.boaminuta.schedule;


import br.com.bomtransporte.boaminuta.exception.MunicipioVazioException;
import br.com.bomtransporte.boaminuta.persistenceMili.repository.IDetalheCargaArquivoRepository;
import br.com.bomtransporte.boaminuta.service.CargasConsultadasService;
import br.com.bomtransporte.boaminuta.service.FilialService;
import br.com.bomtransporte.boaminuta.service.FreteService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
public class AtualizarCargasConsultadasSchedule {

    @Autowired
    private CargasConsultadasService cargasConsultadasService;

    @Autowired
    private IDetalheCargaArquivoRepository repository;

    @Autowired
    private FilialService filialService;
    @Autowired
    private FreteService freteService;

    @PersistenceContext(unitName = "miliPU")
    protected EntityManager entityManager;
    private static boolean processando = false;

    @Scheduled(fixedRate = 1000)
    public void atualizar() {
        if(processando){
            return;
        }
        try {
            var filiais = filialService.getAll();
            for(var filial : filiais){
                var ultimo = cargasConsultadasService.buscarUltimaConsultada(filial.getId());
                LocalDateTime julho = LocalDateTime.of(2024, 7, 1, 0, 0);
                var atualizados = repository.findIdsByEftCodigoAndIdGreaterThanAndDataLiberacaoFaturamentoGreaterThan(filial.getCodigoMili(), ultimo, julho, entityManager);
                for(var carga : atualizados){
                    var arquivo = repository.findById(carga);
                    try {
                        var frete = freteService.atualizarFreteView(filial, arquivo.get());
                        if(frete != null) {
                            cargasConsultadasService.salvar(frete, carga);
                        } else {
                            cargasConsultadasService.salvar(filial, carga);
                        }
                    } catch (MunicipioVazioException e){
                        //NOTHING
                    } catch (Exception e){
                        throw e;
                    }
                }
            }
        } catch (Exception e ){
            throw e;
        } finally {
            processando = false;
        }

    }


}
