package br.com.bomtransporte.boaminuta.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "application")
@Configuration("applicationProperties")
@Data
public class PropertyConfig {

    private String frontendUrl;
    private String cargaService;
    private String datasourceUsernameMili;
    private String datasourcePasswordMili;
    private String datasourceUrlMili;
    private String datasourceDriverClassNameMili;
}
