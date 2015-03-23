package com.model;

public class Student {
	String nameString;
	String course;

	public Student() {
	}

	public Student(String nameString, String course) {
		super();
		this.nameString = nameString;
		this.course = course;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
