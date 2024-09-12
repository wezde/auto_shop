package com.example.auto_shop.dto;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CarDto {

    private String carBrand;
    private int yearManufactured;
}
