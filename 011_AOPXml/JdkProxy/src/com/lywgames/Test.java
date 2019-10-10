package com.lywgames;

import com.lywgames.dao.UserDao;
import com.lywgames.dao.impl.UserDaoImpl;
import com.lywgames.proxy.JDKProxy;

public class Test {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		JDKProxy jdkProxy = new JDKProxy(userDao);
		UserDao proxy = jdkProxy.createProxy();
		proxy.insert();
		proxy.select();
		proxy.update();
		proxy.delete();
	}
}
