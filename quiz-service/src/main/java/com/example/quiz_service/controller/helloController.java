package com.example.quiz_service.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, im in quiz service!";
    }
    
}
