package com.blog.blogspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BlogSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogSpringApplication.class, args);
    }

    @GetMapping("")
    public String welcome() {
        return "Welcome to Blog API with Spring Boot";
    }
}
