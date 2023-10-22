package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.persistence.entity.EstadoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IEstadoRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IFuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {
    @Autowired
    private IEstadoRepository repository;

    public List<EstadoEntity> getAll(){
        return repository.findAll();
    }

    public EstadoEntity findBySigla(String sigla){
        return repository.findBySigla(sigla);
    }

}
