package com.example.demo.model;

//create an insurance for cars (manufacturer, model, year of fabrication, power, ...)

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class Insurence {
    private String model;
    private int yearOfFabrication;
    private int power;
    private int price;
    private String name;

    public Insurence(String name ,String model, int yearOfFabrication, int power, int price) {

        this.name = name;
        this.model = model;
        this.yearOfFabrication = yearOfFabrication;
        this.power = power;
        this.price = price;
    }
}
