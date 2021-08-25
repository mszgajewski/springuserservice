package com.demo.userservice.controller;

import com.demo.userservice.VO.ResponseTemplateVO;
import com.demo.userservice.entity.User;
import com.demo.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        return userService.getUserWithDepartment(userId);
    }
}
