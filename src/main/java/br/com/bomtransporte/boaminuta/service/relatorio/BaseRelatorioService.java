package br.com.bomtransporte.boaminuta.service.relatorio;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.model.relatorio.FiltroRelatorios;
import br.com.bomtransporte.boaminuta.persistence.repository.IFreteRepository;
import br.com.bomtransporte.boaminuta.service.UsuarioService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseRelatorioService<T> {

    @Autowired
    protected IFreteRepository freteRepository;

    @PersistenceContext
    protected EntityManager entityManager;

    @Autowired
    protected UsuarioService usuarioService;

    abstract T buscarPorFiltro(FiltroRelatorios filtro) throws BoaMinutaBusinessException;

    public List<UsuarioModel> buscarResponstaveisOperacional(){
        return freteRepository.buscarResponstaveisOperacional(entityManager);
    }

}
