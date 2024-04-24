package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.exception.AliquotaException;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.persistence.entity.AliquotaEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.EstadoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
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

    public void salvar(AliquotaEntity aliquota) throws AliquotaException {

        var tipo = aliquota.getTipoAliquota().getId();
        var origem = aliquota.getEstadoOrigem().getId();
        var destino = aliquota.getEstadoDestino().getId();
        var filial = aliquota.getFilial().getId();
        var aliquotaExistente = repository.findByEstadoOrigemIdAndEstadoDestinoIdAndTipoAliquotaIdAndFilialId(origem, destino, tipo, filial);
        if(aliquotaExistente != null && !aliquotaExistente.getId().equals(aliquota.getId())){
            throw  new AliquotaException("Já existe uma aliquota cadastrada para esta filial, origem e destino!");
        }
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

    public Double buscarValorAliquotaOrigemDestino(FilialEntity origem, EstadoEntity destino, Long idTipoAliquota) throws AliquotaException {
        try {
            var aliquota = repository.findByEstadoOrigemIdAndEstadoDestinoIdAndTipoAliquotaIdAndFilialId(origem.getMunicipio().getEstado().getId(), destino.getId(), idTipoAliquota, origem.getId());

            return aliquota == null ? 0 : aliquota.getAliquota();
        } catch (Exception e){
            throw e;
        }
    }
}