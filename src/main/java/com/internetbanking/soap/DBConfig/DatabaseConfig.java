package com.internetbanking.soap.DBConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean(name = "core")
    @ConfigurationProperties(prefix = "spring.core")
    public DataSource CoreJdbcTemplate() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "CoreJdbcTemplate")
    public JdbcTemplate CoreDatasource(@Qualifier("core") DataSource CoreJdbcTemplate) {
        return new JdbcTemplate(CoreJdbcTemplate);
    }



}
