package com.assembly.springboot.jdbc;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @ClassName JdbcDataSourceConfig
 * @Description 多数据源配置
 * @Author liulei33
 * @Time 2020/1/9 15:22
 */
@Configuration
public class JdbcDataSourceConfig {

//    @Primary
    @Bean
    @ConfigurationProperties(prefix = "app.datasource.db1")
    public DataSourceProperties db1DataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "app.datasource.db2")
    public DataSourceProperties db2DataSourceProperties(){
        return new DataSourceProperties();
    }

//    @Primary
    @Bean
    public DataSource db1DataSource(){
        return db1DataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean
    public DataSource db2DataSource(){
        return db2DataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "db1JdbcTemplate")
    public JdbcTemplate dbJdbcTemplate(DataSource db1DataSource){
        return new JdbcTemplate(db1DataSource);
    }

    @Bean(name = "db2JdbcTemplate")
    public JdbcTemplate db1JdbcTemplate(DataSource db2DataSource){
        return new JdbcTemplate(db2DataSource);
    }
}
