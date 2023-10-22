package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.exception.AliquotaException;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.persistence.entity.AliquotaEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IAliquotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AliquotaService {
    @Autowired
    private IAliquotaRepository repository;

    public List<AliquotaEntity> getAll(){
        return repository.findAll();
    }

    public void salvar(AliquotaEntity aliquota){
        repository.save(aliquota);
    }
    public void excluir(Long id) throws Exception {
        try {
            repository.deleteById(id);
        } catch (Exception e){
            if(e instanceof DataIntegrityViolationException){
                throw new BoaMinutaBusinessException("Não é possivel excluir a filial, ela possui registros vinculados.");
            }
            throw e;
        }
    }
    public Double buscarValorAliquotaFilial(Long idFilial, Long idTipoAliquota) throws AliquotaException {
        var aliquota = repository.findByFilialIdAndTipoAliquotaId(idFilial, idTipoAliquota);

        return aliquota == null ? 0 : aliquota.getAliquota();
    }

    public Double buscarValorAliquotaOrigemDestino(Long idOrigem, Long idDestino, Long idTipoAliquota) throws AliquotaException {
        var aliquota = repository.findByEstadoOrigemIdAndEstadoDestinoIdAndTipoAliquotaId(idOrigem, idDestino, idTipoAliquota);

        return aliquota == null ? 0 : aliquota.getAliquota();
    }

}
