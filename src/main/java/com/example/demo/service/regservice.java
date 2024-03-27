package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.login;
import com.example.demo.repository.logrepo;

@Service
public class regservice {

    @Autowired
    private logrepo rep;
    public login saveUser(String username, String password) {
        login user = new login();
        user.setUsername(username);
        user.setPassword(password);
        return rep.save(user);
        
    }

}