package com.example.microservicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAApplication.class, args);
    }
}

@RestController
class MicroserviceAController {
    @GetMapping("/serviceA")
    public String serviceA() {
        return "Response from Service A";
    }
}
