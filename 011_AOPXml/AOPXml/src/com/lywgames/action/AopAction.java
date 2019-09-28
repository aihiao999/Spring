package com.lywgames.action;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lywgames.dao.UserDao;

public class AopAction {
	@Test
	public void testBefore() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = context.getBean(UserDao.class);
		userDao.insert();
		userDao.select();
		userDao.delete();
		userDao.update();
		context.close();
	}
}
