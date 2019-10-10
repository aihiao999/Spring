package com.lywgames;

import com.lywgames.dao.impl.UserDaoImpl;
import com.lywgames.proxy.CglibProxy;

public class Test {
	public static void main(String[] args) {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		CglibProxy cglibProxy = new CglibProxy(userDaoImpl);
		UserDaoImpl proxy = cglibProxy.createProxy();
		proxy.insert();
		proxy.select();
		proxy.update();
		proxy.delete();
	}
}
