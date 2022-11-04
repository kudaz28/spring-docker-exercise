package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class DockerProductsController { 
    @GetMapping("/products") 
    public String getMessage() { 
        return "A brand new product"; 
    } 
} 