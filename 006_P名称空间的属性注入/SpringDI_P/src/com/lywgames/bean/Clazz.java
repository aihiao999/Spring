package com.lywgames.bean;

public class Clazz {
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Clazz [teacher=" + teacher + "]";
	}
	
}
