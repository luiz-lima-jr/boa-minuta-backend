package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.enuns.ExperienciaBomEnum;
import br.com.bomtransporte.boaminuta.persistence.entity.CaminhaoEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.MotoristaEntity;
import br.com.bomtransporte.boaminuta.persistence.repository.ICaminhaoRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IFreteRepository;
import br.com.bomtransporte.boaminuta.persistence.repository.IMotoristaRepository;
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

    @Autowired
    private IMotoristaRepository motoristaRepository;

    @Autowired
    private IFreteRepository freteRepository;

    public CaminhaoService(){

    }

    public void salvar(CaminhaoEntity caminhao){
        if(caminhao.getTransportador().getId() == null){
            pessoaTransporteRepository.save(caminhao.getTransportador());
        }

        if(!caminhao.isMotoristaDiferente()){
            caminhao.getMotorista().setPessoaTransporte(caminhao.getTransportador());
        }
        if(caminhao.getMotorista().getId() == null){
            motoristaRepository.save(caminhao.getMotorista());
        }
        caminhao.setDataAlteracao(LocalDateTime.now());
        caminhaoRepository.save(caminhao);
    }

    public void atualizar(CaminhaoEntity caminhaoAnterior, CaminhaoEntity caminhaoNovo){
        atualizarTransportador(caminhaoAnterior, caminhaoNovo);
        atualizarMotorista(caminhaoAnterior, caminhaoNovo);

        caminhaoAnterior.setDataAlteracao(LocalDateTime.now());
        caminhaoRepository.save(caminhaoAnterior);
    }

    private void atualizarTransportador(CaminhaoEntity caminhaoAnterior, CaminhaoEntity caminhaoNovo){
        var transportadorNovo = caminhaoNovo.getTransportador();
        caminhaoAnterior.setTransportador(transportadorNovo);
        pessoaTransporteRepository.save(transportadorNovo);
    }

    private void atualizarMotorista(CaminhaoEntity caminhaoAnterior, CaminhaoEntity caminhaoNovo){
        var motoristaNovo = caminhaoNovo.getMotorista();
        caminhaoAnterior.setMotorista(motoristaNovo);

        if(motoristaNovo.getPessoaTransporte().getResponsavelOperacional() == null) {
            motoristaNovo.getPessoaTransporte().setResponsavelOperacional(usuarioService.getUsuarioLogado());
        }
        motoristaNovo.setExperiencia(caminhaoAnterior.getMotorista().getExperiencia());
        motoristaRepository.save(motoristaNovo);
    }

    public CaminhaoEntity findById(Long idCaminhao){
        return caminhaoRepository.findById(idCaminhao).get();
    }

    public List<CaminhaoEntity> filtrarPorPlaca(String placa){
        List<CaminhaoEntity> caminhao = caminhaoRepository.findByPlacaLike(placa);
        return caminhao;
    }

    public CaminhaoEntity buscarPorPlaca(String placa){
        try {
            List<CaminhaoEntity> caminhoes = caminhaoRepository.findByPlaca(placa);
            return caminhoes != null && !caminhoes.isEmpty() ? caminhoes.get(0) : null;
        }catch (Exception e){
            throw e;
        }
    }

    public ExperienciaBomEnum getExperienciaMotorista(Long idPessoa){
        Long qtd = freteRepository.findQtdByPessoaMotoristaId(idPessoa);
        if(qtd > 5){
            return ExperienciaBomEnum.CARREGA_SEMPRE;
        } else if(qtd == 0){
            return ExperienciaBomEnum.NOVO_PARA_CARREGAMENTO;
        } else {
            return ExperienciaBomEnum.RETORNANDO;
        }
    }
}
