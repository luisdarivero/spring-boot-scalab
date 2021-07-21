package com.arquitectura.servicios.rest.repository;

import com.arquitectura.servicios.rest.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {

    /* select * from */
    public List<Car> findAll(){
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car();
        car1.setName("Tiggo");
        car1.setModel("7");
        car1.setColor("White");
        car1.setOwner("Chery");
        car1.setType("Gasolina");
        cars.add(car1);
        Car car2 = new Car();
        car2.setName("Mustang");
        car2.setModel("GT");
        car2.setColor("Blue");
        car2.setOwner("Ford");
        car2.setType("Gasolina");
        cars.add(car2);
        return cars;
    }

    public Car findById(Integer id){
        Car car1 = new Car();
        car1.setName("Tiggo");
        car1.setModel("7");
        car1.setColor("White");
        car1.setOwner("Chery");
        car1.setType("Gasolina");
        return car1;
    }

    public Car save(Car car){
        return car;
    }
}
