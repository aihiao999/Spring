package com.lywgames.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.lywgames.dao.UserDao;

@Component(value="userDao") 
// 相当于我们在Spring的XML配置了一个bean,<bean name="userDao" class="com.lywgames.dao.impl.UserDaoImpl"/>
public class UserDaoImpl implements UserDao {
	@Value("张三") // 注册普通属性
	private String name;
	
	@Override
	public void save() {
		System.out.println("保存" + name + "成功。");
	}

}
