package com.example.demo.service;

import com.example.demo.model.Insurence;
import lombok.RequiredArgsConstructor;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public User findByName(String name){
        return userRepository.findByName(name);
    }
    public String delete(String name){
        return userRepository.delete(name);
    }
}
