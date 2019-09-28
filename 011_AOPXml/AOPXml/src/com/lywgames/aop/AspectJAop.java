package com.lywgames.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectJAop {
	public void beforeInsertCheck() {
		System.out.println("检测插入数据");
	}
	public void afterInsertCheck() {
		System.out.println("检测插入数据是否成功");
	}
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
	public void deleteAfterReturn(int result) {
		System.out.println("删除后返回值:" + result);
	}
	public void updateException(Throwable ex) {
		System.out.println("更新发生了异常:" + ex.toString());
	}
	public void myFinally() {
		System.out.println("更新方法发生了异常, 最终通知一样会执行完成。");
	}
}
