package com.rai.controllers;

import com.rai.model.User;
import com.rai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/admin")
    public ResponseEntity <String> adminUser(){
        return ResponseEntity.ok("Yes, I am an admin user");
    }

    @GetMapping("/public")
    public ResponseEntity<String> publicUser(){
        return ResponseEntity.ok("I am public user");
    }
}
