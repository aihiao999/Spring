package com.lywgames.service.impl;

import com.lywgames.dao.CustomerDao;
import com.lywgames.domain.Customer;
import com.lywgames.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

}
