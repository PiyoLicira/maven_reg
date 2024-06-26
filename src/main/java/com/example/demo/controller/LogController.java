package com.example.demo.controller;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.login;
import com.example.demo.service.logservice;

@Controller
public class LogController {
 
    @Autowired
    private logservice service;
 
    @GetMapping("/")
    public String api()
    {
 
        return "log";
    }
 
    @PostMapping("/log")
     public String login(@ModelAttribute("user") login user) {
  
 
        login oauthUser = service.log(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/disp";
        } else {
            return "redirect:/";
        }
    }
    @GetMapping("/reg")
    public String register()
    {
 
        return "reg";
    }
    @GetMapping("/disp")
    public String display() {
        return "disp";
    }
}
