package com.example.demo.service;

import com.example.demo.model.Insurence;
import com.example.demo.repository.InsuranceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InsuranceService {
    private final InsuranceRepository insuranceRepository;

    public Insurence createInsurance(Insurence insurence){
        return insuranceRepository.saveInsurance(insurence);
    }

    public List<Insurence> findAll(){
        return  insuranceRepository.findAll();
    }
}
