package com.example.producer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Producer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Producer2Application.class, args);
    }

}
