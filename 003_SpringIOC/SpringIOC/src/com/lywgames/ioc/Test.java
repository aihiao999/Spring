package com.lywgames.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lywgames.ioc.dao.UserDao;

public class Test {
	public static void main(String[] args) {
		// 类路径加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取UserDao
		UserDao userDao = context.getBean(UserDao.class);
		// 调用UserDao的login接口
		userDao.login();
	}
}
