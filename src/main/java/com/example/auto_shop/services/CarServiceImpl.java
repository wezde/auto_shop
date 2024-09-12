package com.example.auto_shop.services;

import com.example.auto_shop.dto.CarDto;
import com.example.auto_shop.entity.Car;
import com.example.auto_shop.repository.CarRepository;
import com.example.auto_shop.utils.CarMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    CarRepository carRepository;
    CarMapper carMapper;

    @Override
    public List<Car> findAll() {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    public CarDto findById(Long id) {
       return carMapper.mapToCarDto(carRepository.findById(id));
    }

//    @Override
//    public CarDto findByYear(int yearManufactured) {
//       return carMapper.mapToCarDto(Optional.ofNullable(carRepository.findByYear(yearManufactured)));
//    }
}
