package com.jhart;

public class Teacher extends Person{
	public String teacher_id;

	public int teacher_age;
	
	
	
	
	
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_id;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_id = teacher_name;
	}
	public int getTeacher_age() {
		return teacher_age;
	}
	public void setTeacher_age(int teacher_age) {
		this.teacher_age = teacher_age;
	}
	
	
	public Teacher() {}
	
	public Teacher(String teacher_name, int teacher_age) {
		super();
		this.teacher_id = teacher_name;
		this.teacher_age = teacher_age;
	}
	
	
}

