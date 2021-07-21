package com.arquitectura.servicios.rest.service;

import com.arquitectura.servicios.rest.model.Customer;
import com.arquitectura.servicios.rest.repository.CustomerInMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerInMemoryRepository repository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        System.out.println("Guardando");
        return repository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        System.out.println("Actualizando");
        return repository.update(customer);
    }

    @Override
    public boolean delete() {
        System.out.println("Elimando");
        return true;
    }
}
