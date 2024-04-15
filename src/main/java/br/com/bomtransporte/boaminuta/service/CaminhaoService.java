package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.persistence.entity.CaminhaoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.ICaminhaoRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IPessoaTransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CaminhaoService {

    @Autowired
    private ICaminhaoRepository caminhaoRepository;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private IPessoaTransporteRepository pessoaTransporteRepository;

    public CaminhaoService(){

    }

    public void salvar(CaminhaoEntity caminhao){
        if(caminhao.getTransportador().getId() == null){
            pessoaTransporteRepository.save(caminhao.getTransportador());
        }
        if(caminhao.getMotorista().getId() == null){
            pessoaTransporteRepository.save(caminhao.getMotorista());
        }
        caminhao.setDataAlteracao(LocalDateTime.now());
        caminhaoRepository.save(caminhao);
    }

    public void atualizar(CaminhaoEntity caminhaoAnterior, CaminhaoEntity caminhaoNovo){
        var transportadorNovo = caminhaoNovo.getTransportador();
        caminhaoAnterior.setTransportador(transportadorNovo);
        pessoaTransporteRepository.save(transportadorNovo);

        atualizarMotorista(caminhaoAnterior, caminhaoNovo);

        caminhaoAnterior.setDataAlteracao(LocalDateTime.now());
        caminhaoRepository.save(caminhaoAnterior);
    }

    private void atualizarMotorista(CaminhaoEntity caminhaoAnterior, CaminhaoEntity caminhaoNovo){
        var motoristaNovo = caminhaoNovo.getMotorista();
        if(caminhaoNovo.isCopiarTransportador()){
            caminhaoAnterior.getTransportador().setExperiencia(motoristaNovo.getExperiencia());
            motoristaNovo = caminhaoAnterior.getTransportador();
        }
        caminhaoAnterior.setMotorista(motoristaNovo);

        if(motoristaNovo.getResponsavelOperacional() == null) {
            motoristaNovo.setResponsavelOperacional(usuarioService.getUsuarioLogado());
        }
        pessoaTransporteRepository.save(motoristaNovo);
    }

    public CaminhaoEntity findById(Long idCaminhao){
        return caminhaoRepository.findById(idCaminhao).get();
    }

    public List<CaminhaoEntity> filtrarPorPlaca(String placa){
        return caminhaoRepository.findByPlacaLike(placa);
    }

    public CaminhaoEntity buscarPorPlaca(String placa){
        return caminhaoRepository.findByPlaca(placa);
    }
}
