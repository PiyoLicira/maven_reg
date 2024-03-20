package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.login;
import com.example.demo.repository.logrepo;

@Service
public class logservice {
    @Autowired
    private logrepo rep;
    public login  log(String useranme, String password)
    {
        login user=rep.findByUsernameAndPassword(useranme, password);
        return user;
    }

}
