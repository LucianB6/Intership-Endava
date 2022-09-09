package com.example.demo.repository;

import com.example.demo.model.Insurence;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    private UserRepository userRepository;
    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        users.add(user);
        return user;
    }
    public User findByName(String name){
        return findAll().stream()
                .filter(user -> user.getName().equals(name))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }
    public String delete(String name){
        users.remove(findByName(name));

        return name;
    }


}
