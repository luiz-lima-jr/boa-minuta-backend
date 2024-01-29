package br.com.bomtransporte.boaminuta.client2;

import br.com.bomtransporte.boaminuta.mili.ConsultarCargasDisponiveisResponse;
import br.com.bomtransporte.boaminuta.mili.ReceberCargaResponse;
import br.com.bomtransporte.boaminuta.persistenceMili.repository.IConsultarCargasDisponiveisArquivoRepository;
import br.com.bomtransporte.boaminuta.persistenceMili.repository.IDetalheCargaArquivoRepository;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.io.File;
import java.io.PrintWriter;

@Component
public class CargaMiliClient extends WebServiceGatewaySupport {

    @Autowired
    private IConsultarCargasDisponiveisArquivoRepository consultarCargasDisponiveisArquivoRepository;

    @Autowired
    private IDetalheCargaArquivoRepository detalheCargaArquivoRepository;

    public ConsultarCargasDisponiveisResponse consultarCargasDisponiveis(Long codigoMili) throws Exception {
        //return (ConsultarCargasDisponiveisResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        var path = System.getProperty("user.dir");
        var path2 = System.getProperty("project.basedir");
        JAXBContext jaxbContext = JAXBContext.newInstance(ConsultarCargasDisponiveisResponse.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        var res = this.getClass().getResource("/wsdl/consultarCargasDisponiveis.xml");
        var wsdl = consultarCargasDisponiveisArquivoRepository.findTopByCodigoFilialOrderByIdDesc(codigoMili);
        if(wsdl == null){
            return null;
        }
        var file = new File("consultarCargasDisponiveis-"+wsdl.getCodigoFilial()+".xml");
        file.createNewFile();
        try(PrintWriter out = new PrintWriter(file)) {
            out.println(wsdl.getArquivo());
        }
        var carga =  (ConsultarCargasDisponiveisResponse) jaxbUnmarshaller.unmarshal(new File(res.getFile()));
        file.delete();

        return  carga;
    }

    public ReceberCargaResponse receberCarga(Long nroCarga, Long codigoMili) throws Exception {
        try {
            var path = System.getProperty("user.dir");
            var path2 = System.getProperty("project.basedir");
            JAXBContext jaxbContext = JAXBContext.newInstance(ReceberCargaResponse.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            var wsdl = detalheCargaArquivoRepository.findTopByCodigoFilialAndCodigoCargaOrderByIdDesc(codigoMili, nroCarga);
            if(wsdl == null){
                return null;
            }
           // var res = this.getClass().getResource("/wsdl/carga-completa"+codigoMili+".xml");
            var file = new File("carga-completa-"+wsdl.getCodigoFilial()+"-"+nroCarga+".xml");
            file.createNewFile();
            try(PrintWriter out = new PrintWriter(file)) {
                out.println(wsdl.getArquivo());
            }
            var carga =  (ReceberCargaResponse) jaxbUnmarshaller.unmarshal(file);
            file.delete();
            return carga;
        } catch (Exception e){
            throw e;
        }

        //return (ReceberCargaResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public ReceberCargaResponse consultarDetalheCarga(Long codigoFilial, Long codigoCarga) throws Exception {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ReceberCargaResponse.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            var wsdl = detalheCargaArquivoRepository.findTopByCodigoFilialAndCodigoCargaOrderByIdDesc(codigoFilial, codigoCarga);
            var res = this.getClass().getResource("/wsdl/carga-completa"+codigoCarga+".xml");
            var file = new File("carga-completa-"+wsdl.getCodigoFilial()+".xml");
            file.createNewFile();
            try(PrintWriter out = new PrintWriter(file)) {
                out.println(wsdl.getArquivo());
            }
            var carga =  (ReceberCargaResponse) jaxbUnmarshaller.unmarshal(new File(res.getFile()));
            file.delete();
            return carga;
        } catch (Exception e){
            throw e;
        }

        //return (ReceberCargaResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

}