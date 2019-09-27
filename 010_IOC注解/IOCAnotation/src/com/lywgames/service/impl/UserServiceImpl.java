package com.lywgames.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lywgames.dao.UserDao;
import com.lywgames.service.UserService;

@Component(value="userService") // 相当于我们在XML配置了一个bean,<bean name="userService" class="com.lywgames.service.impl.UserServiceImpl"/>
public class UserServiceImpl implements UserService {
	@Autowired // 注册对象类型
	@Qualifier(value="userDao") // 按照名称完成属性注入
	private UserDao userDao;
	
	@Override
	public void save() {
		userDao.save();
	}

}
