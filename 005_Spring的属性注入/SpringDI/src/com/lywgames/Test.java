package com.lywgames;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lywgames.bean.Clazz;
import com.lywgames.bean.Student;
import com.lywgames.bean.Teacher;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(context.getBean(Student.class).toString());
		System.out.println(context.getBean(Teacher.class).toString());
		System.out.println(context.getBean(Clazz.class).toString());
		context.close();
	}
}
