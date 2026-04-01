package com.shaun.controller;


import com.shaun.model.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public User getUser(){

        User user = new User();
        user.setEmail("shaun@gmail.com");
        
    }
}
