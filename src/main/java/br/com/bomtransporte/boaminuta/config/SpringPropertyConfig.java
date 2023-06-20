package br.com.bomtransporte.boaminuta.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "spring.mail")
@Configuration("applicationPropertiesSpring")
@Data
public class SpringPropertyConfig {
    private String username;
}
