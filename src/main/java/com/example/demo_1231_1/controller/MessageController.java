package com.example.demo_1231_1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @GetMapping("/hello")
    public String hello(){
        return "Full Stack Java Development with Spring Boot & VueJS!";
    }
}