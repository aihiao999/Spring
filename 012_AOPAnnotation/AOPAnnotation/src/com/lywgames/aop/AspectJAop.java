package com.lywgames.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJAop {
	@Before(value="execution(* com.lywgames.dao.impl.UserDaoImpl.insert(..))")
	public void beforeInsertCheck() {
		System.out.println("检测插入数据");
	}
	
	@AfterReturning(value="execution(* com.lywgames.dao.impl.UserDaoImpl.delete(..))", returning="result")
	public void afterDelete(int result) {
		System.out.println("删除后返回值:" + result);
	}
	
	@Around(value="AspectJAop.selectPoint()")
	public Object arround(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println("查询前鼓鼓掌。");
			Object obj = joinPoint.proceed();
			System.out.println("查询后鼓鼓掌。");
			return obj;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@AfterThrowing(value="AspectJAop.updateExceptionPoint()", throwing="ex")
	public void updateException(Throwable ex) {
		System.out.println("更新发生了异常:" + ex.toString());
	}
	
	@After(value="AspectJAop.updateFinallyPoint()")
	public void myFinally() {
		System.out.println("更新方法发生了异常, 最终通知一样会执行完成。");
	}
	
	@Pointcut(value="execution(* com.lywgames.dao.impl.UserDaoImpl.select(..))")
	private void selectPoint() {}
	@Pointcut(value="execution(* com.lywgames.dao.impl.UserDaoImpl.update(..))")
	private void updateExceptionPoint() {}
	@Pointcut(value="execution(* com.lywgames.dao.impl.UserDaoImpl.update(..))")
	private void updateFinallyPoint() {}
}
