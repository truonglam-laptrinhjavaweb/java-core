package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.CustomerModel;

public interface ICustomerService {
	List<CustomerModel> findAll();
}
