package com.softinium.carrental.repository;

import com.softinium.carrental.entity.Car;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class CarRepository {

    public List<Car> findAll() {
        return List.of(
                Car.builder()
                        .id(UUID.randomUUID())
                        .color("Red")
                        .name("Ferrari")
                        .build(),
                Car.builder()
                        .id(UUID.randomUUID())
                        .color("Green")
                        .name("Dodge")
                        .build()
        );
    }
}
