package com.arquitectura.servicios.rest.controller;

import com.arquitectura.servicios.rest.model.Customer;
import com.arquitectura.servicios.rest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/{id}/{name}")
    public Customer findById(@PathVariable("id") Integer id, @PathVariable("name") String name){
        return customerService.findById(id);
    }

    @PostMapping()
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PutMapping()
    public Customer update(@RequestBody Customer customer){
        return customerService.update(customer);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id)
    {
        return customerService.delete();
    }

    @DeleteMapping()
    public boolean delete(@RequestBody Customer customer)
    {
        return customerService.delete();
    }
}
