package com.lywgames.ioc.dao.impl;

import com.lywgames.ioc.dao.UserDao;

public class UserDaoImpl implements UserDao {
	public UserDaoImpl() {
		System.out.println("实例化构造函数");
	}
	@Override
	public void login() {
		System.out.println("查询用户成功.");
	}

}
