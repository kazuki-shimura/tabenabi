package com.example.tabenabi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/locations")
    public String locations() {
        return "Locations";
    }

    @GetMapping("/details")
    public String details() {
        return "details";
    }
}
