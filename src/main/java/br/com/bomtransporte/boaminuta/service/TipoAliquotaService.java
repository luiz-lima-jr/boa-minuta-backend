package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.persistence.entity.TipoAliquotaEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.ITipoAliquotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoAliquotaService {
    @Autowired
    private ITipoAliquotaRepository repository;

    public List<TipoAliquotaEntity> getAll(){
        return repository.findAll();
    }

}
