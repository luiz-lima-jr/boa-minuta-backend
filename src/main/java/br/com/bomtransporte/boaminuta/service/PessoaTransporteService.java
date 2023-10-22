package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.persistence.entity.PessoaTransporteEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.IPessoaTransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaTransporteService {

    @Autowired
    private IPessoaTransporteRepository pessoaTransporteRepository;

    public PessoaTransporteService(){

    }

    public void salvar(PessoaTransporteEntity pessoa){
        pessoaTransporteRepository.save(pessoa);
    }


    public List<PessoaTransporteEntity> filtrarPorNome(String nome){
        return pessoaTransporteRepository.findByNomeContains(nome);
    }
}
