package com.example.demo.controller;


import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.domain.login;
import com.example.demo.service.logservice;
import com.example.demo.service.regservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class RegController {
    @Autowired
    private regservice service;

    @PostMapping("/reg")
    public String login(@ModelAttribute("user") login user) {
        service.saveUser(user.getUsername(), user.getPassword());


           return "redirect:/disp";
       
   }
    

}
