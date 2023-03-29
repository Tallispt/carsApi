package com.cars.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarsDTO;

@RestController
@RequestMapping("/cars")
public class carsController {
  
  @GetMapping
  public String oi() {
    return "Oi";
  }

  @PostMapping
  public void createCar(@RequestBody CarsDTO req) {
    System.out.println(req);
  }
}
