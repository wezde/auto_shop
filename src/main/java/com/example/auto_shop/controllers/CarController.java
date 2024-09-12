package com.example.auto_shop.controllers;

import com.example.auto_shop.dto.CarDto;
import com.example.auto_shop.entity.Car;
import com.example.auto_shop.services.CarService;
import com.example.auto_shop.utils.CarMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequestMapping("/")
public class CarController {

    CarService carService;
    CarMapper carMapper;

    @GetMapping("/car")
    public List<Car> findAll() {
        return carService.findAll();
    }

    @GetMapping("/car/{id}")
    public CarDto findById(@PathVariable Long id) {
        return carService.findById(id);
    }
}
