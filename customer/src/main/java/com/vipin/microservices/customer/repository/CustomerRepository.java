package com.vipin.microservices.customer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vipin.microservices.customer.models.Customer;

public interface CustomerRepository  extends CrudRepository<Customer, Long> {
	   List<Customer> findByCustomerName(String customerName); 

}



