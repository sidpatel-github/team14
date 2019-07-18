package com.example.team14;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloAppEngineApplication {
    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
