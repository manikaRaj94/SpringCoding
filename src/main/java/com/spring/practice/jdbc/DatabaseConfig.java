package com.spring.practice.jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@PropertySource("classpath:db.properties")
@Configuration
public class DatabaseConfig {
    @Value("${DB_DRIVER}")
    private String driverClass;

    @Value("${DB_URL}")
    private String url;

    @Value("${DB_USERNAME}")
    private String username;


    @Value("${DB_PASSWORD}")
    private String password;

    @Bean(name="jdbcTemplate")
    public JdbcTemplate getConnection()
    {
        DriverManagerDataSource src = new DriverManagerDataSource();
        src.setDriverClassName(driverClass);
        src.setUrl(url);
        src.setUsername(username);
        src.setPassword(password);

        JdbcTemplate jdbcTemplate= new JdbcTemplate(src);
        return jdbcTemplate;
    }

    public void getConnectionDetails()
    {
        System.out.println("Driver Class : "+driverClass);
        System.out.println("Url : "+url);
        System.out.println("Username : "+username);
        System.out.println("password : "+password);
    }
}
