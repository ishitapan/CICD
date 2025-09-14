package com.cicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot App!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running fine.";
    }

    @GetMapping("/info")
    public String info() {
        return "This is a simple Spring Boot application without DB.";
    }
}
