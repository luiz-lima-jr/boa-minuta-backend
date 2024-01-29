package br.com.bomtransporte.boaminuta.config.persistence;

import br.com.bomtransporte.boaminuta.config.PropertyConfig;
import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
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
        entityManagerFactoryRef = "boaMinutaEntityManagerFactory",
        transactionManagerRef = "boaMinutaTransactionManager",
        basePackages = { "br.com.bomtransporte.boaminuta.persistence.repository" }
)
public class BancoBoaMinutaConfiguration {

    @Autowired
    PropertyConfig env;

    @Primary
    @Bean(name = "boaMinutaEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("boaMinutaDataSource") DataSource dataSource) {
        Map<String, String> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "update");
       // properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        //properties.put("spring.datasource.driver-class-name", "com.mysql.cj.jdbc.Driver");
        return builder
                .dataSource(dataSource)
                .packages("br.com.bomtransporte.boaminuta.persistence.entity")
                .persistenceUnit("boaMinutaPU")
                .properties(properties)
                .build();
    }
    @Primary
    @Bean(name = "boaMinutaDataSource")
    @ConfigurationProperties("spring.boaminuta.datasource")
    public HikariDataSource dataSource(DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().type(HikariDataSource.class)
                .build();
    }

    @Primary
    @Bean(name = "boaMinutaTransactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("boaMinutaEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

}
