package com.arquitectura.servicios.rest.service;

import com.arquitectura.servicios.rest.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer findById(Integer id);

    Customer save(Customer customer);

    Customer update(Customer customer);

    boolean delete();
}
