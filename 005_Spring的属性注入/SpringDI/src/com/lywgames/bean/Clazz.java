package com.lywgames.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Clazz {
	private Teacher teacher;
	private List<Student> studentList;
	private Set<Student> studentSet;
	private Map<Integer, Student> studentMap;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Set<Student> getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set<Student> studentSet) {
		this.studentSet = studentSet;
	}

	public Map<Integer, Student> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<Integer, Student> studentMap) {
		this.studentMap = studentMap;
	}

	@Override
	public String toString() {
		return "Clazz [teacher=" + teacher + ", studentList=" + studentList + ", studentSet=" + studentSet
				+ ", studentMap=" + studentMap + "]";
	}

}
