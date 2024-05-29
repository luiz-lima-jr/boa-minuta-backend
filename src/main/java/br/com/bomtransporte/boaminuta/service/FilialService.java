package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FilialModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FilialEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IFilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilialService {
    @Autowired
    private IFilialRepository filialRepository;

    @Autowired
    private  UsuarioService usuarioService;

    public List<FilialEntity> getAll(){
        return filialRepository.findAll();
    }

    public List<FilialModel> getFiliaisUsuario(){
        var filiaisEntity = usuarioService.getUsuarioLogadoDadosAcesso().isAdministrador()
                ? getAll() : usuarioService.getUsuarioLogadoDadosAcesso().getFiliaisEntity();
        return filiaisEntity.stream().map(f -> new FilialModel(f.getId(), f.getNome())).collect(Collectors.toList());
    }
    public List<FilialEntity> getFiliaisUsuarioEntity(){
        return usuarioService.getUsuarioLogadoDadosAcesso().isAdministrador()
                ? getAll() : usuarioService.getUsuarioLogadoDadosAcesso().getFiliaisEntity();
    }

    public FilialEntity getByCodigoMili(Long codigoMili){
        return filialRepository.findByCodigoMili(codigoMili);
    }
    public FilialEntity getByCodigoCarregamento(Long codigoCarregamento){
        return filialRepository.findByCodigoCarregamento(codigoCarregamento);
    }

    public List<FilialEntity> getTodasByIds(List<Long> ids){
        return filialRepository.findAllByIdIn(ids);
    }

    public FilialModel getModelById(Long idFilial) {
        var filial = filialRepository.findById(idFilial).get();
        return new FilialModel(filial.getId(), filial.getNome());
    }

    public FilialModel getModelByCodigoMili(Long codigoMili) {
        var filial = filialRepository.findByCodigoMili(codigoMili);
        return new FilialModel(filial.getId(), filial.getNome(), filial.getCodigoMili());
    }

    public FilialEntity getById(Long idFilial) {
        return filialRepository.findById(idFilial).get();
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
