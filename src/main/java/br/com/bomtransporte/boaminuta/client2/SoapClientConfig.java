package br.com.bomtransporte.boaminuta.client2;

import br.com.bomtransporte.boaminuta.service.DetalheCargaArquivoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

//@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("br.com.bomtransporte.boaminuta.mili");
        return jaxb2Marshaller;
    }

    @Bean
    public DetalheCargaArquivoService articleClient(Jaxb2Marshaller jaxb2Marshaller) {
        DetalheCargaArquivoService articleClient = new DetalheCargaArquivoService();
        articleClient.setDefaultUri("https://web2.mili.com.br/eFrotasws/miliws/CargaService");
        articleClient.setMarshaller(jaxb2Marshaller);
        articleClient.setUnmarshaller(jaxb2Marshaller);
        return articleClient;
    }
}