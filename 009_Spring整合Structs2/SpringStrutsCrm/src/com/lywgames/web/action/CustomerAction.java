package com.lywgames.web.action;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lywgames.domain.Customer;
import com.lywgames.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	private static final long serialVersionUID = 1L;
	
	// 模型驱动使用的对象
	private Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		return customer;
	}

	/**
	 * 跳转到添加页面的方法:saveUI
	 */
	public String saveUI(){
		return "saveUI";
	}

	public String save() {
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(sc);
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = applicationContext.getBean(CustomerService.class);
		customerService.save(customer);
		return NONE;
	}
}
