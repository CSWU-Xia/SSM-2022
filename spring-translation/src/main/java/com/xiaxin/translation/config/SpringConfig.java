package com.xiaxin.translation.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement()
@ComponentScan(basePackages = "com.xiaxin.translation")
public class SpringConfig {

    @Bean
    public DataSource getDataSource() throws Exception {
        Properties prop = new Properties();
        prop.load(SpringConfig.class.getClassLoader().getResourceAsStream("druid.properties"));
        return DruidDataSourceFactory.createDataSource(prop);
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public TransactionManager getTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
