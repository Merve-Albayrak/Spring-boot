package com.springsecurity.springsecurityclient.controller;

import com.springsecurity.springsecurityclient.entity.User;
import com.springsecurity.springsecurityclient.model.UserModel;
import com.springsecurity.springsecurityclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){


        User user=userService.registerUser(userModel);
        return "success";


    }


}
