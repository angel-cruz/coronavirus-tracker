package io.javabrains.coronavirustracker.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
