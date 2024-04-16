package com.gentech.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	//http://localhost:8081/customer
	@GetMapping("/customer")
	public Customer getCustomer()
	{
		return new Customer("Santosh","Bangalore",9010203040L);
	}
	
	//http://localhost:8081/customers
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		List<Customer> customers=new ArrayList<>();
		customers.add(new Customer("John", "Kolar", 9100010011L));
		customers.add(new Customer("Adams", "Mandya", 9122010011L));
		customers.add(new Customer("Jones", "Hassan", 9111110011L));
		customers.add(new Customer("Smith", "Mysore", 9133310011L));
		return customers;
	}
	
}
