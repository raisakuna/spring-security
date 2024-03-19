package com.rai.controllers;

import com.rai.model.User;
import com.rai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/{user}")
    public User getSingleUser(@PathVariable("user") String username){
        return this.userService.getUser(username);

    }
    @PostMapping("/")
    public User add(@RequestBody User user){
        return this.userService.addUser(user);
    }
}
