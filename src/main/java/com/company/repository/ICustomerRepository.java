package com.company.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.model.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, String> {
	
	List<Customer> findAll();

}
