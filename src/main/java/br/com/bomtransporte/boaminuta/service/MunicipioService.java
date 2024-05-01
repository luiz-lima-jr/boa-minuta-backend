package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.exception.MunicipioVazioException;
import br.com.bomtransporte.boaminuta.persistence.entity.MunicipioEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IMunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioService {

    @Autowired
    private IMunicipioRepository repository;

    public MunicipioEntity buscarPorCodigoIbge(Long codigoIbge) throws BoaMinutaBusinessException {
        var municipio = repository.findByCodigoIbge(codigoIbge);
        if(municipio == null){
            throw new MunicipioVazioException("Codigo IBGE não localizado: " + codigoIbge);
        }
        return municipio;
    }
}
