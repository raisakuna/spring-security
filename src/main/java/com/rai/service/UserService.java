package com.rai.service;

import com.rai.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list =new ArrayList<>();

    // Constructor adding new users
    public UserService(){
        list.add(new User("abc", "abc","abc@gmail.com"));
        list.add(new User("xsc", "dfwbc","xas@gmail.com"));

    }

    // get all users
    public List<User> getAllUsers(){
        return this.list;
    }

    // get Single user
    public User getUser(String username){
        return this.list.stream().filter((user) ->user.getName().equals(username)).findAny().orElse(null);
    }

    // add new user
    public User addUser(User user){
        this.list.add(user);
        return user;
    }



}
