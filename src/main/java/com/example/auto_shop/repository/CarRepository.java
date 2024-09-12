package com.example.auto_shop.repository;

import com.example.auto_shop.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {

//   Car findByYear(int yearManufactured);
}
