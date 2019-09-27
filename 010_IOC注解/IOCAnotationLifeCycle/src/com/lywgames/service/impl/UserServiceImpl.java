package com.lywgames.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lywgames.dao.UserDao;
import com.lywgames.service.UserService;

@Service(value="userService") // 相当于我们在XML配置了一个bean,<bean name="userService" class="com.lywgames.service.impl.UserServiceImpl"/>
@Scope(value="singleton")
public class UserServiceImpl implements UserService {
	@Resource(name="userDao") // 完成对象的按名称注入
	private UserDao userDao;
	
	@Override
	public void save() {
		userDao.save();
	}

}
