package com.xiaxin.jdbctemplate.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource("druid.properties")
@ComponentScan(basePackages = "com.xiaxin.jdbctemplate")
public class SpringConfig {

    @Bean
    public DataSource getDataSource() throws Exception {
        Properties prop = new Properties();
        prop.load(SpringConfig.class.getClassLoader().getResourceAsStream("druid.properties"));
        return DruidDataSourceFactory.createDataSource(prop);
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
