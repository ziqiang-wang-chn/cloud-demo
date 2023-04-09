package com.example.myconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MyconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyconsumerApplication.class, args);
    }

}
