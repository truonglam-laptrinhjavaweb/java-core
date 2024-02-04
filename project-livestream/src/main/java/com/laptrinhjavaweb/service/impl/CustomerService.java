package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.entity.CustomerEntity;
import com.laptrinhjavaweb.model.CustomerModel;
import com.laptrinhjavaweb.repository.ICustomerRepository;
import com.laptrinhjavaweb.repository.impl.CustomerRepository;
import com.laptrinhjavaweb.service.ICustomerService;

public class CustomerService implements ICustomerService {
	
	private ICustomerRepository customerRepository = new CustomerRepository();

	@Override
	public List<CustomerModel> findAll() {
		List<CustomerModel> results = new ArrayList<>();
		List<CustomerEntity> customerEntities = customerRepository.findAll();
		for (CustomerEntity item: customerEntities) {
			CustomerModel customerModel = new CustomerModel();
			customerModel.setId(item.getId());
			customerModel.setEmail(item.getEmail());
			customerModel.setFullName(item.getFullName());
			customerModel.setPhone(item.getPhone());
			results.add(customerModel);
		}
		return results;
	}
}
