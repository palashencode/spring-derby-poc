package com.java.spring.starterjdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@ComponentScan("com.java.spring.starterjdbc.config")
public class SpringJdbcConfig {
    @Bean
    public DataSource derbyDataSource() {
    //     DriverManagerDataSource dataSource = new DriverManagerDataSource();
    // dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
    SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
    dataSource.setDriver(new org.apache.derby.jdbc.ClientDriver());    
    dataSource.setUrl("jdbc:derby://localhost:1527/DBDerby;create=false");
        // dataSource.setUsername("guest_user");
        // dataSource.setPassword("guest_password");
        return dataSource;
    }
}
