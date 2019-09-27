package com.lywgames.dao.impl;

import org.springframework.beans.factory.annotation.Value;

import com.lywgames.dao.UserDao;

public class UserDaoImpl implements UserDao {
	@Value("张三") // 注册普通属性
	private String name;
	
	@Override
	public void save() {
		System.out.println("保存" + name + "成功。");
	}
	
}
