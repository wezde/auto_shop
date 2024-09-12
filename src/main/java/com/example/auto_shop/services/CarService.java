package com.example.auto_shop.services;

import com.example.auto_shop.dto.CarDto;
import com.example.auto_shop.entity.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    CarDto findById(Long id);

//    CarDto findByYear(int yearManufactured);
}
