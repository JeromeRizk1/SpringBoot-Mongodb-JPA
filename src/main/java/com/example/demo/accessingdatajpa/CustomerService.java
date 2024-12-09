package com.example.demo.accessingdatajpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Iterable<Customer> getAllUsers() {
        return customerRepository.findAll();
    }

    public Customer createUser(Customer user) {
        return customerRepository.save(user);
    }
}
