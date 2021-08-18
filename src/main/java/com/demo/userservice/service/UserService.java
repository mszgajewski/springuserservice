package com.demo.userservice.service;

import com.demo.userservice.entity.User;
import com.demo.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser( User user) {
        return userRepository.save(user);
    }
}
