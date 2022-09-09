package com.example.demo.repository;

import com.example.demo.model.House;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HouseRepository {
    List<House> houses = new ArrayList<>();

    public List<House> findAll(){
        return houses;
    }
    public House save(House house){
        houses.add(house);
        return house;
    }
}
