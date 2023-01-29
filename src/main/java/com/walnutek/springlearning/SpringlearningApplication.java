package com.walnutek.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class SpringlearningApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringlearningApplication.class, args);
    }
}
