package br.com.bomtransporte.boaminuta.service.relatorio;

import br.com.bomtransporte.boaminuta.enuns.ExperienciaBomEnum;
import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.model.FreteFiltro;
import br.com.bomtransporte.boaminuta.model.UsuarioModel;
import br.com.bomtransporte.boaminuta.model.relatorio.CaptacaoCaminhoneiroModel;
import br.com.bomtransporte.boaminuta.model.relatorio.IndicadorDesempenhoResponsavelModel;
import br.com.bomtransporte.boaminuta.model.relatorio.RelatorioCaptacaoCaminhoneiroModel;
import br.com.bomtransporte.boaminuta.model.relatorio.RelatorioIndicadorDesempenhoFretesModel;
import br.com.bomtransporte.boaminuta.persistence.entity.FreteEntity;
import br.com.bomtransporte.boaminuta.persistence.entity.UsuarioEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RelatorioCaptacaoCaminhoesService extends BaseRelatorioService {
    public RelatorioCaptacaoCaminhoneiroModel buscarPorFiltro(FreteFiltro filtro) throws BoaMinutaBusinessException {
        var fretes = freteRepository.findByFiltroFretesCalculados(filtro, entityManager);

        var countNovo = countExperiencia(filtro, ExperienciaBomEnum.NOVO_PARA_CARREGAMENTO);
        var carregaSempre = countExperiencia(filtro, ExperienciaBomEnum.CARREGA_SEMPRE);
        var retornando = countExperiencia(filtro, ExperienciaBomEnum.RETORNANDO);

        var caminhoneiros = new ArrayList<CaptacaoCaminhoneiroModel>();

        for(FreteEntity frete : fretes){
            CaptacaoCaminhoneiroModel caminhoneiro = new CaptacaoCaminhoneiroModel(frete.getResponsavelOperacional().getNome(),
                                                                                         frete.getPlaca(),
                                                                                            frete.getCaminhao().getMotorista().getExperiencia().getDesc());
            caminhoneiros.add(caminhoneiro);
        }
        var relatorio = new RelatorioCaptacaoCaminhoneiroModel();

        relatorio.setList(caminhoneiros);
        relatorio.setNovoParaCarregamento(countNovo);
        relatorio.setCarregaSempre(carregaSempre);
        relatorio.setRetornando(retornando);

        return relatorio;
    }

    private long countExperiencia(FreteFiltro filtro, ExperienciaBomEnum experiencia){
        var count = 0l;
        var experiencias = filtro.getExperienciasBom();
        if(filtro.getExperienciasBom() == null || filtro.getExperienciasBom().isEmpty()){
            filtro.setExperienciasBom(Arrays.asList(experiencia));
            count = freteRepository.countByFiltro(filtro, entityManager);
        } else if (filtro.getExperienciasBom().contains(experiencia)){
            filtro.setExperienciasBom(Arrays.asList(experiencia));
            count = freteRepository.countByFiltro(filtro, entityManager);
        }
        filtro.setExperienciasBom(experiencias);
        return count;
    }
    private IndicadorDesempenhoResponsavelModel montarIndicador(RelatorioIndicadorDesempenhoFretesModel relatorio, UsuarioEntity key, List<FreteEntity> fretesResponsavel){
        var indicador = new IndicadorDesempenhoResponsavelModel(new UsuarioModel(key.getId(), key.getNome()));
        for(var frete : fretesResponsavel) {
            addIndicadorResponsavel(indicador, frete);
            relatorio.addTotalCargas(1);
            relatorio.addTotalM3(frete.getM3());
            relatorio.addTotalFrete(frete.getFrete());
            relatorio.addTotalComplemento(frete.getComplementoCalculo());
            relatorio.addTotalFretePago(frete.getFretePago());
            relatorio.addTotalSomaImpostos(frete.totalImpostos());
            relatorio.addTotalPedagio(frete.getPedagio());
        }
        return indicador;
    }


    private void addIndicadorResponsavel(IndicadorDesempenhoResponsavelModel indicador, FreteEntity frete){
        indicador.addCargas(1);
        indicador.addM3(frete.getM3());
        indicador.addFretes(frete.getFrete());
        indicador.addComplemento(frete.getComplementoCalculo());
        indicador.addFretePago(frete.getFretePago());
        indicador.addSomaImpostos(frete.totalImpostos());
        indicador.addPedagio(frete.getPedagio());
    }



}
