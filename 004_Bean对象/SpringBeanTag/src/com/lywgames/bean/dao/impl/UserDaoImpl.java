package com.lywgames.bean.dao.impl;

import com.lywgames.bean.dao.UserDao;

public class UserDaoImpl implements UserDao {
	public UserDaoImpl() {
		System.out.println("实例化构造函数。");
	}
	
	public void init() {
		System.out.println("UserDaoImpl初始化了。");
	}
	
	@Override
	public void login() {
		System.out.println("查询用户成功。");
	}

	public void destroy() {
		System.out.println("UserDaoImpl销毁了。");
	}
}
