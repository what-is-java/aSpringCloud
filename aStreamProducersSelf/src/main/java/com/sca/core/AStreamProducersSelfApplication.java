package com.sca.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class AStreamProducersSelfApplication {
    public static void main(String[] args) {
        SpringApplication.run(AStreamProducersSelfApplication.class,args);
    }
}

