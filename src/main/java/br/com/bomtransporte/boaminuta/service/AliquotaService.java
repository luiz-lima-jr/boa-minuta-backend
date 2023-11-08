package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.enuns.TipoAliquotaEnum;
import br.com.bomtransporte.boaminuta.exception.AliquotaException;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.persistence.entity.AliquotaEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.EstadoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IAliquotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AliquotaService {
    @Autowired
    private IAliquotaRepository repository;

    public List<AliquotaEntity> getAll(){
        return repository.findAll();
    }

    public void salvar(AliquotaEntity aliquota) throws AliquotaException {
        var idsAliquotasValidacao = Arrays.asList(TipoAliquotaEnum.ISS.getId(), TipoAliquotaEnum.DISTRIBUICAO.getId());
        if(idsAliquotasValidacao.contains(aliquota.getTipoAliquota().getId())){
            var aliquotaCadastrada = repository.findByFilialIdAndTipoAliquotaId(aliquota.getFilial().getId(), TipoAliquotaEnum.ISS.getId());
            if(aliquotaCadastrada != null && aliquotaCadastrada.getId() != aliquota.getId()){
                throw  new AliquotaException("Já existe uma aliquota cadastrada para esta filial!");
            }
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
        var aliquota = repository.findByFilialIdAndEstadoDestinoIdAndTipoAliquotaId(origem.getId(), destino.getId(), idTipoAliquota);

        return aliquota == null ? 0 : aliquota.getAliquota();
    }

}
