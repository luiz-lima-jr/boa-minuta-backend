package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IFilialRepository;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
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
        try {
            filialRepository.deleteById(id);
        } catch (Exception e){
            if(e instanceof DataIntegrityViolationException){
                throw new BoaMinutaBusinessException("Não é possivel excluir a filial, ela possui registros vinculados.");
            }
            throw e;
        }
    }

}
