package com.example.auto_shop.utils;

import com.example.auto_shop.dto.CarDto;
import com.example.auto_shop.entity.Car;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarMapper {
    /**
     * Метод для конвертации car to carDto
     * parameter Car
     * return CarDto
     */
    public CarDto mapToCarDto(Optional<Car> car) {
        CarDto carDto = new CarDto();
        car.ifPresent(c -> carDto.setCarBrand(c.getCarBrand()));
        car.ifPresent(c -> carDto.setYearManufactured(c.getYearManufactured()));
        return carDto;
    }

    /**
     * Метод для конвертации carDto to car
     * parameter CarDto
     * return Car
     */
    public Car mapToCar(CarDto carDto) {
        Car car = new Car();
        car.setCarBrand(carDto.getCarBrand());
        car.setYearManufactured(carDto.getYearManufactured());
        return car;
    }
}
