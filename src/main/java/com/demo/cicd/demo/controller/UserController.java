package com.demo.cicd.demo.controller;

import com.demo.cicd.demo.model.User;
import com.demo.cicd.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/create-user")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

}
