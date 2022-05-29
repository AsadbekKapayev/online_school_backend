package com.example.onlineschool.service;

import com.example.onlineschool.mapper.UserMapper;
import com.example.onlineschool.model.Role;
import com.example.onlineschool.model.Status;
import com.example.onlineschool.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User findByEmail(String email) {
        return userMapper.findByEmail(email);
    }

    @Override
    public void create(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setStatus(Status.ACTIVE);
        System.out.println(user.getRole());
        System.out.println(user.getStatus());
        userMapper.create(user);
    }
}
