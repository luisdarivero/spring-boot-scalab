package com.arquitectura.servicios.rest.service;

import com.arquitectura.servicios.rest.model.Car;

import java.util.List;

public interface CarService {

    //Cuando trabajamos con interfaces, todos los métodos son públicos

    List<Car> findAll();

    Car findById(Integer id);

    Car save(Car car);
}
