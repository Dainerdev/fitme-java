package com.dainerdev.fitme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
    
    @GetMapping("/register")
    public String register() {
        return "user/register";
    }

    @GetMapping("/login")
    public String logIn() {
        return "user/login";
    }

    @GetMapping("/home")
    public String home() {
        return "user/home/home";
    }
    

    @GetMapping("/imc")
    public String imc() {
        return "user/home/imc";
    }
}
