package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IFuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncaoService {
    @Autowired
    private IFuncaoRepository funcaoRepository;

    public List<FuncaoEntity> getAll(){
        return funcaoRepository.findAll();
    }

}
