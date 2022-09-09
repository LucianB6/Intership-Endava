package com.example.demo.controller;

import com.example.demo.model.House;
import com.example.demo.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/house")
@RequiredArgsConstructor
public class HouseController {
    private final HouseService houseService;

    @GetMapping
    public List<House> findAll(){
        return houseService.findAll();
    }

    @PostMapping("/create")
    public House create(@RequestBody House house){
       return houseService.create(house);
    }
}
