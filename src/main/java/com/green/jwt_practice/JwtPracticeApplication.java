package com.green.jwt_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class JwtPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtPracticeApplication.class, args);
    }
}
