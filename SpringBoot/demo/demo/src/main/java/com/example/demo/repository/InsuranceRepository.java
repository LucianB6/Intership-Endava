package com.example.demo.repository;

import com.example.demo.model.Insurence;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InsuranceRepository {
    List<Insurence> insurences = new ArrayList<>();

    private InsuranceRepository insuranceRepository;
    public Insurence saveInsurance(Insurence insurence){
        insurences.add(insurence);
        return insurence;
    }

    public List<Insurence> findAll(){
        return insurences;
    }
}
