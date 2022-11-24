package com.digitalinnovationone.SpringBoot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.SQLOutput;


@Configuration
@ConfigurationProperties("spring.datasource")// Mapeando todo o spring.datasource que fica no application.
@Setter
@Getter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDatabaseConnection(){
        System.out.println("DB Connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2_TEST - Test Instance";
    }

    @Profile("prod")
    @Bean
    public String productionDatabaseConnection(){
        System.out.println(" - DB Connection for Production - MYSQL");
        System.out.println(" - " + driverClassName);
        System.out.println(" - " + url);
        return " - DB Connection to MYSQ_PROD - Production Instance";
    }


}
