package com.example.demo.model;

// - create an insurance for houses (address, building year, number of rooms, ...)

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class House {
    private String address;
    private int buildingYear;
    private int numberRooms;

    public House(String address, int buildingYear, int numberRooms) {
        this.address = address;
        this.buildingYear = buildingYear;
        this.numberRooms = numberRooms;
    }
}
