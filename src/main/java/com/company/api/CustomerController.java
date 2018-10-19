package com.company.api;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.dto.CustomerDTO;
import com.company.mapper.CustomerMapper;
import com.company.repository.ICustomerRepository;

@RestController
public class CustomerController {

	
	@Autowired
	private ICustomerRepository customerRepository;
	@Autowired
	private CustomerMapper mapper;
	
	@GetMapping(value="/customers",produces="application/json")
	public List<CustomerDTO> getCustomers(){
		return customerRepository.findAll().stream().map(customer -> mapper.asCustomerDto(customer)).collect(Collectors.toList());		
 }
	
	
//	@GetMapping(value="/customers/{id}",produces="application/json")
//	public CustomerDTO viewCustomer(@PathVariable String id){
//		return customers.stream().filter(customer -> customer.getId().equals(id)).findAny().orElse(null);
//	}
//	@PostMapping(value="/customers",consumes="application/json")
//	public String createCustomer(@RequestBody CustomerDTO customer){
//		customers.add(customer);
//		return customer.getId();
//	}
//	@PutMapping(value="/customers/{id}",consumes="application/json")
//	public String modifierCustomer(@PathVariable String id,@RequestBody CustomerDTO customerDTO){
//		Optional<CustomerDTO> customerAmodifer = customers.stream().filter(customer -> customer.getId().equals(id)).findAny();
//		if (customerAmodifer.isPresent()) {
//			customerAmodifer.get().setFirstName(customerDTO.getFirstName());
//			customerAmodifer.get().setLastName(customerDTO.getLastName());
//		}
//		
//		return customerDTO.getId();
//	}
//	
//	@DeleteMapping(value="/customers/{id}")
//	public void supprimerCustomer(@PathVariable String id){
//		Optional<CustomerDTO> customerAmodifer = customers.stream().filter(customer -> customer.getId().equals(id)).findAny();
//		if (customerAmodifer.isPresent()) {
//			customers.remove(customerAmodifer.get());
//		}
//	}
	
	

}
