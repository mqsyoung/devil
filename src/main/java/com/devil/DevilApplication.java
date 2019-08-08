package com.devil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  // 注册中心注解
@SpringBootApplication
public class DevilApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevilApplication.class, args);
    }

}
