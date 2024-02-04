package com.laptrinhjavaweb.controller;

import java.util.List;

import com.laptrinhjavaweb.model.CustomerModel;
import com.laptrinhjavaweb.service.ICustomerService;
import com.laptrinhjavaweb.service.impl.CustomerService;

public class CustomerController {
	
	private ICustomerService customerService = new CustomerService();
	
	public List<CustomerModel> findAll() {
		List<CustomerModel> results = customerService.findAll();
		return results;
	}
}
