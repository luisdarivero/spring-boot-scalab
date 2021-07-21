package com.arquitectura.servicios.rest.repository;

import com.arquitectura.servicios.rest.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerInMemoryRepository {

    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Cliente ");
        customer.setLastName("De Prueba");
        customer.setYearsOld(25);
        customers.add(customer);
        customer = new Customer();
        customer.setName("Cliente ");
        customer.setLastName("De Prueba 2");
        customer.setYearsOld(35);
        customers.add(customer);
        return customers;
    }

    public Customer findById(Integer id){
        Customer customer = new Customer();
        customer.setName("Cliente ");
        customer.setLastName("De Prueba");
        customer.setYearsOld(25);
        return customer;
    }

    public Customer save(Customer customer){
        return customer;
    }

    public Customer update(Customer customer){
        return customer;
    }
}
