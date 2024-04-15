package br.com.bomtransporte.boaminuta.service;


import br.com.bomtransporte.boaminuta.persistence.entity.CargasConsultadas;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.ICargasConsultadasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CargasConsultadasService {

    @Autowired
    private ICargasConsultadasRepository repository;

    public Long buscarUltimaConsultada(Long idFilial){
        var ultimo = repository.findFirstByFreteFilialIdOrderByIdViewDesc(idFilial).orElse(null);
        return  ultimo == null ? 0L : ultimo.getIdView();
    }

    public void salvar(FreteEntity frete, Long idView){
        CargasConsultadas carga = new CargasConsultadas();
        carga.setFrete(frete);
        carga.setIdView(idView);
        carga.setDataRegistro(LocalDateTime.now());
        repository.save(carga);
    }

}
