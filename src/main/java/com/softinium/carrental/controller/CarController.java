package com.softinium.carrental.controller;

import com.softinium.carrental.entity.Car;
import com.softinium.carrental.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/api/cars")
    public List<Car> getCars() {
        return carService.getAllCars();
    }
}
