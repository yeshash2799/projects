package com.yeshash.exceptionhandling.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.yeshash.exceptionhandling.dto.UserDTO;
import com.yeshash.exceptionhandling.entity.User;
import com.yeshash.exceptionhandling.exception.UserNotFoundException;
import com.yeshash.exceptionhandling.service.UserService;
import jakarta.validation.Valid;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@Valid @RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @GetMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @GetMapping("/user/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUserById(@PathVariable("id") int id) throws UserNotFoundException {
        return userService.getUserById(id);
    }
}
