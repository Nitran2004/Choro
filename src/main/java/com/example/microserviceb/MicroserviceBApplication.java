package com.example.microserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceBApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceBApplication.class, args);
    }
}

@RestController
class MicroserviceBController {
    @GetMapping("/serviceB")
    public String serviceB() {
        return "Response from Service B";
    }
}
