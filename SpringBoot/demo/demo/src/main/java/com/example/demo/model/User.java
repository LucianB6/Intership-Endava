package com.example.demo.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }
}