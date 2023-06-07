package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FuncaoEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IFilialRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IFuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilialService {
    @Autowired
    private IFilialRepository filialRepository;

    public List<FilialEntity> getAll(){
        return filialRepository.findAll();
    }

    public void salvar(FilialEntity filial){
        filialRepository.save(filial);
    }

    public void excluir(Long id) throws Exception {
        filialRepository.deleteById(id);
    }

}
