package com.lywgames.action;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lywgames.dao.impl.UserDaoImpl;

public class AopAction {
	@Test
	public void testBefore() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDaoImpl userDaoImpl = context.getBean(UserDaoImpl.class);
		userDaoImpl.insert();
		userDaoImpl.delete();
		userDaoImpl.select();
		userDaoImpl.update();
		context.close();
	}
}
