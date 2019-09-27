package com.lywgames.web.action;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lywgames.service.UserService;

public class UserAction {
	
	@Test
	public void save() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = applicationContext.getBean(UserService.class);
		userService.save();
		applicationContext.close();
	}
	
}
