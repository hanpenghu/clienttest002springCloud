package com.clienttest002.clienttest002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class Clienttest002Application {

    public static void main(String[] args) {
        SpringApplication.run(Clienttest002Application.class, args);
    }

}
