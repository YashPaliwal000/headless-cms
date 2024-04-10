package com.headless.cms.controller;

import com.headless.cms.model.EmailDetails;
import com.headless.cms.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.headless.cms.model.User;
import com.headless.cms.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        if(createdUser != null){
            emailService.sendSimpleMail(new EmailDetails(user.getEmail(), "Welcome To Port Headless-CMS",
                    "WELCOME TO THE EASY WORLD!!",""));
        }
        return createdUser;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }


}
