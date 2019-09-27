package com.lywgames.dao.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.lywgames.dao.UserDao;

@Repository(value="userDao") // 相当于我们在XML配置了一个bean,<bean name="userDao" class="com.lywgames.dao.impl.UserDaoImpl"/>
public class UserDaoImpl implements UserDao {
	@Value("张三") // 注册普通属性
	private String name;
	
	public UserDaoImpl() {
		System.out.println("UserDaoImpl被创建了");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("UserDaoImpl被初始化了");
	}
	
	@Override
	public void save() {
		System.out.println("保存" + name + "成功。");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("UserDaoImpl被销毁了");
	}

}
