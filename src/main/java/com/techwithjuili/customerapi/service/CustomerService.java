package com.techwithjuili.customerapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techwithjuili.customerapi.entity.Customer;
import com.techwithjuili.customerapi.repository.CustomerRepository;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer savedCustomer) {
        Customer customer = new Customer();
        customer.setFirstName(savedCustomer.getFirstName());
        customer.setLastName(savedCustomer.getLastName());
        customer.setEmail(savedCustomer.getEmail());
        customer.setPhoneNumber(savedCustomer.getPhoneNumber());
        return customerRepository.save(savedCustomer);
    }

    public Optional<Customer> getCustomerByEmail(String email){
        Customer customer = customerRepository.findCustomerByEmail(email);

        return Optional.ofNullable(customer);
    }

}