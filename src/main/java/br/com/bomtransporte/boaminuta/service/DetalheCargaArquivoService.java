package br.com.bomtransporte.boaminuta.service;

import br.com.bomtransporte.boaminuta.mili.ConsultarCargasDisponiveisResponse;
import br.com.bomtransporte.boaminuta.mili.ReceberCargaResponse;
import br.com.bomtransporte.boaminuta.persistenceMili.entity.DetalheCargaArquivoEntity;
import br.com.bomtransporte.boaminuta.persistenceMili.repository.IConsultarCargasDisponiveisArquivoRepository;
import br.com.bomtransporte.boaminuta.persistenceMili.repository.IDetalheCargaArquivoRepository;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@Component
public class DetalheCargaArquivoService extends WebServiceGatewaySupport {

    @Autowired
    private IConsultarCargasDisponiveisArquivoRepository consultarCargasDisponiveisArquivoRepository;

    @Autowired
    private IDetalheCargaArquivoRepository detalheCargaArquivoRepository;

    public ReceberCargaResponse consultarDetalheCarga(Long codigoFilial, Long codigoCarga) throws Exception {
        try {
            var result = detalheCargaArquivoRepository.findByEftCodigoAndCodigoCargaOrderByIdDesc(codigoFilial, codigoCarga);
            if(result.isEmpty()){
                return null;
            }
            var wsdl = result.stream().findFirst().get();
            return converterWsdlToReceberCargaResponse(wsdl);
        } catch (Exception e){
            throw e;
        }
    }

    public ReceberCargaResponse converterWsdlToReceberCargaResponse(DetalheCargaArquivoEntity wsdl) throws JAXBException, IOException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ReceberCargaResponse.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            var file = new File("carga-completa-"+wsdl.getCodigoCarga()+".xml");
            file.createNewFile();
            try(PrintWriter out = new PrintWriter(file)) {
                var arquivo = wsdl.getArquivo();
                var tagFim = "</receberCargaResponse>";
                var indexInicio = arquivo.indexOf("<receberCargaResponse");
                var indexFim = arquivo.indexOf(tagFim);
                var substring = arquivo.substring(indexInicio, indexFim + tagFim.length());
                substring = removerCampos(substring);
                out.println(substring);
            }
            var carga =  (ReceberCargaResponse) jaxbUnmarshaller.unmarshal(file);
            file.delete();
            return carga;
        } catch (Exception e){
            throw e;
        }
    }

    private String removerCampos(String wsdl){
        wsdl = wsdl.replaceAll("xsi:nil=\"true\"","");

        return wsdl;
    }

}