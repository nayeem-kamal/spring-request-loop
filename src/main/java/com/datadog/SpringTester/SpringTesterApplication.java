package com.datadog.SpringTester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootApplication
public class SpringTesterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTesterApplication.class, args);
    }
}

