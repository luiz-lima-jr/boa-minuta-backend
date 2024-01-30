package br.com.bomtransporte.boaminuta.config.persistence;

import br.com.bomtransporte.boaminuta.config.PropertyConfig;
import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "miliEntityManagerFactory",
        transactionManagerRef = "miliTransactionManager",
        basePackages = { "br.com.bomtransporte.boaminuta.persistenceMili.repository" }
)
public class BancoMiliConfiguration {

    @Autowired
    private PropertyConfig propertyConfig;
    @Bean(name = "miliEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("miliDataSource") DataSource dataSource) {
        Map<String, String> properties = new HashMap<>();
        properties.put("spring.jpa.hibernate.ddl-auto", "update");
        return builder
                .dataSource(dataSource)
                .packages("br.com.bomtransporte.boaminuta.persistenceMili.entity")
                .persistenceUnit("miliPU")
                .properties(properties)
                .build();
    }
    @Bean(name = "miliDataSource")
    @ConfigurationProperties("spring.mili.datasource")
    public HikariDataSource dataSource(DataSourceProperties properties) {
        properties.setUrl(propertyConfig.getDatasourceUrlMili());
        properties.setDriverClassName(propertyConfig.getDatasourceDriverClassNameMili());
        properties.setUsername(propertyConfig.getDatasourceUsernameMili());
        properties.setPassword(propertyConfig.getDatasourcePasswordMili());
        return properties.initializeDataSourceBuilder().type(HikariDataSource.class)
                .build();
    }

    @Bean(name = "miliTransactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("miliEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

}
