package com.lywgames.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lywgames.bean.dao.UserDao;

public class Test {
	public static void main(String[] args) {
		// 类路径加载配置文件, 并实例化配置的单例模式Bean对象
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 获取UserDao, 如果是多利在getBean的时候实例化对象
		UserDao userDao = context.getBean(UserDao.class);
		// 调用UserDao的login接口
		userDao.login();
		
		// 关闭
		context.close();
	}
}
