package com.example.demo.controller;

import com.example.demo.model.Insurence;
import lombok.RequiredArgsConstructor;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userService.create(user);
    }


    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{name}")
    public User findByName(@PathVariable String name){
        return userService.findByName(name);
    }

    @DeleteMapping("/delete/{name}")
    public String deleteById(@PathVariable String name) {
        return userService.delete(name);
    }
}
