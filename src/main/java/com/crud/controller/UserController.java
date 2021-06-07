package com.crud.controller;

import com.crud.entity.User;
import com.crud.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping("/user/{id}")
    public User geyUserById(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }
    @RequestMapping(value = "userone",method = RequestMethod.POST)
    public User getUserByIdPost(@RequestParam(value = "id")Integer id){
        return userService.getUserById(id);
    }
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public List<User> getUser(){
        return userService.getAllUser();
    }
}
