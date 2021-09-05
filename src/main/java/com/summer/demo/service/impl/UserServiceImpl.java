package com.summer.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.summer.demo.entity.User;
import com.summer.demo.mapper.UserMapper;
import com.summer.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> getAll() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("sequence");
        return userMapper.selectList(wrapper);
    }

    @Override
    public User saveUser(User user) {
        if (user != null) {
            user.setId(null);
            userMapper.insert(user);
            return user;
        }
        return null;
    }
}
