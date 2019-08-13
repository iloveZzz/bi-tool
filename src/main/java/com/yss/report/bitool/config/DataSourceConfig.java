package com.yss.report.bitool.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import tk.mybatis.mapper.autoconfigure.MybatisProperties;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.yss.report.bitool.mapper")
public class DataSourceConfig {

    @Bean
    @Qualifier("oracle")
    @ConfigurationProperties(prefix="spring.datasource.oracle")
    @Primary
    public DataSource oracleDataSource() {
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

    @Autowired
    private MybatisProperties mybatisProperties;

    @Bean("oracleSessionFactory")
    public SqlSessionFactory oracleSessionFactory(@Qualifier("oracle") DataSource oracleDataSource ) throws Exception {

        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(oracleDataSource); // 使用主数据源, 连接主库
        Resource[] resource = new PathMatchingResourcePatternResolver().getResources(mybatisProperties.getMapperLocations()[0]);
        factoryBean.setMapperLocations(resource);
        return factoryBean.getObject();

    }



}
 
