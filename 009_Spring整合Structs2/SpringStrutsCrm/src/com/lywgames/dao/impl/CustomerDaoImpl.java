package com.lywgames.dao.impl;

import com.lywgames.dao.CustomerDao;
import com.lywgames.domain.Customer;

public class CustomerDaoImpl implements CustomerDao {
	public void save(Customer customer) {
		System.out.println(customer.toString() + "\r\n保存客戶成功。");
	}
}
