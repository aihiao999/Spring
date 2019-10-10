package com.lywgames.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.lywgames.dao.impl.UserDaoImpl;

public class CglibProxy implements MethodInterceptor {
	private UserDaoImpl userDaoImpl;
	
	public CglibProxy(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	// 使用cglib产生代理
	public UserDaoImpl createProxy() {
		// 创建cglib的核心类
		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(userDaoImpl.getClass());
		// 设置回调
		enhancer.setCallback(this);
		// 返回增强对象
		return (UserDaoImpl)enhancer.create();
	}
	
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		if("insert".equals(method.getName())) {
			System.out.println("插入User对象前, 对其进行校验。");
			return methodProxy.invokeSuper(proxy, args);
		}
		return methodProxy.invokeSuper(proxy, args);
	}

}
