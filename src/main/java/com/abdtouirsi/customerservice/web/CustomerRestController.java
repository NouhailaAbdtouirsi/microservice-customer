package com.abdtouirsi.customerservice.web;

import com.abdtouirsi.customerservice.dao.entities.Customer;
import com.abdtouirsi.customerservice.dao.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> customerList() {
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{id}")
    public Customer customerById( @PathVariable Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @PostMapping("/customer")
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
