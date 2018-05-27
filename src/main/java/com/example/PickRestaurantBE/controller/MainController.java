package com.example.PickRestaurantBE.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/greeting")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
