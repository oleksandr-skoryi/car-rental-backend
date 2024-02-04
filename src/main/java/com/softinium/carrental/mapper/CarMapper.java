package com.softinium.carrental.mapper;

import com.softinium.carrental.dto.response.CarResponse;
import com.softinium.carrental.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public CarResponse toDto(Car car) {
        return CarResponse.builder()
                .id(car.getId())
                .color(car.getColor())
                .name(car.getName())
                .build();
    }
}
