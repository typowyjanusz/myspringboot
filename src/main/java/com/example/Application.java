package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Janusz on 2015-12-12.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.repository")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
