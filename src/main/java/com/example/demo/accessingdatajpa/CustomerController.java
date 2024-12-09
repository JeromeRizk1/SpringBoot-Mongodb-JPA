package com.example.demo.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public Iterable<Customer> getAllUsers() {
        return customerService.getAllUsers();
    }


    @PostMapping
    public Customer createUser(@RequestBody Customer user) {
        return customerService.createUser(user);
    }
}
