package com.arquitectura.servicios.rest.controller;

import com.arquitectura.servicios.rest.model.Car;
import com.arquitectura.servicios.rest.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    //http://localhost:8080/car
    @PostMapping()
    public List<Car> findAll(){
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public Car findById(@PathVariable("id") Integer id){
        return carService.findById(id);
    }

    @PostMapping()
    public Car save(@RequestBody Car car){
        return carService.save(car);
    }
}
