package com.nen.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages = {"com.nen"})
public class JavaConfig {

    @Bean
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

}
