package com.example.customer.Service;

import com.example.customer.Model.Customer;
import com.example.customer.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository repository){
        this.customerRepository = repository;
    }

    public List<Customer> retrieveCustomer(){
        return (List<Customer>) customerRepository.findAll();
    }

    public  List<Customer> retrieveCustomer(String name){
        return customerRepository.findByFirstName(name);
    }
}
