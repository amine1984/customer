package com.company.mapper;

import com.company.dto.CustomerDTO;
import com.company.model.Customer;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL, withIoC = IoC.SPRING)
public interface CustomerMapper {
	
	
	CustomerDTO asCustomerDto (Customer in);
	
	Customer asCustomer(CustomerDTO in);
}
