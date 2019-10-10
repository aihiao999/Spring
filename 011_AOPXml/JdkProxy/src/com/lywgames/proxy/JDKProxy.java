package com.lywgames.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.lywgames.dao.UserDao;

public class JDKProxy implements InvocationHandler{
	private UserDao userDao;
	
	public JDKProxy(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserDao createProxy() {
		return (UserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if("select".equals(method.getName())) {
			System.out.println("查询User对象前, 对其进行校验。");
			return method.invoke(userDao, args);
		}
		return method.invoke(userDao, args);
	}

}
