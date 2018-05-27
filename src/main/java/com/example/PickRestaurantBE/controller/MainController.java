package com.example.PickRestaurantBE.controller;

import com.example.PickRestaurantBE.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private final MainService service;

    public MainController(MainService service) {
        this.service = service;
    }

    @GetMapping("/greeting")
    public String getMainService() {
        return service.getMainService();
    }
}
