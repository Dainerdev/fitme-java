package com.dainerdev.fitme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
    
    @GetMapping("/register")
    public String getMethodName() {
        return "user/register";
    }
    
}
