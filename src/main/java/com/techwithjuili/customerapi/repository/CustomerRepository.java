package com.techwithjuili.customerapi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.techwithjuili.customerapi.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    @Query("SELECT c FROM Customer c WHERE c.email =:email")
    Customer findCustomerByEmail(String email);

}
