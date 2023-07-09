package com.example.weeklytestecommerce.Controller;

import com.example.weeklytestecommerce.Model.User;
import com.example.weeklytestecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("saveUsers")
    public String addUsers(@RequestBody List<User> userList){
        return userService.addUsers(userList);
    }

    @GetMapping("userById/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
}
