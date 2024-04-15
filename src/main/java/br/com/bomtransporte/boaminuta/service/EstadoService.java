package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.persistence.entity.EstadoEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IEstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class EstadoService {
    @Autowired
    private IEstadoRepository repository;

    public List<EstadoEntity> getAll(){
        var estados = repository.findAll();
        estados.sort(Comparator.comparing(EstadoEntity::getSigla));
        return estados;
    }

    public EstadoEntity findBySigla(String sigla){
        return repository.findBySigla(sigla);
    }

}
