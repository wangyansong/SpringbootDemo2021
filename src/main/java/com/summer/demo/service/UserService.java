package com.summer.demo.service;

import com.summer.demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User saveUser(User user);


}
