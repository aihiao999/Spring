package com.lywgames.service.impl;

import javax.annotation.Resource;

import com.lywgames.dao.UserDao;
import com.lywgames.service.UserService;

public class UserServiceImpl implements UserService {
	@Resource(name="userDao") // 完成对象的按名称注入
	private UserDao userDao;
	
	@Override
	public void save() {
		userDao.save();
	}

}
