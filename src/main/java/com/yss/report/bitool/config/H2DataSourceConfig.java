package com.yss.report.bitool.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@AutoConfigureBefore(DataSourceConfig.class)
public class H2DataSourceConfig {
    @Bean
    @Qualifier("h2DataSource")
    @ConfigurationProperties(prefix="spring.datasource.h2")
    @ConditionalOnMissingBean(DruidDataSource.class)
    public DataSource h2DataSource() {
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }
    
}
 
