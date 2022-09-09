package com.example.demo.controller;

import com.example.demo.model.Insurence;
import com.example.demo.service.InsuranceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
 public class InsuranceController{

 private final InsuranceService insuranceSevice;

 @PostMapping("/create/insurance/car")
 public Insurence createInsurance(@RequestBody Insurence insurence) {
  return insuranceSevice.createInsurance(insurence);
 }

 @GetMapping("/insurance")
 public List<Insurence> findAll(){
  return  insuranceSevice.findAll();
 }
}