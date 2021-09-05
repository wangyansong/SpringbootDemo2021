package com.summer.demo.controller;

import com.summer.demo.entity.User;
import com.summer.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping( "/save")
    public User saveUser(User user) {
       return userService.saveUser(user);
    }

    @GetMapping( "/getAll")
    public List<User> getUser() {
        return userService.getAll();
    }

}
