package com.jihe;

public class PersonModel {
	String name;
	int age;
	String sex;
	public PersonModel(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public PersonModel() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		// TODO 自动生成的方法存根
		return name;
	}
	
}
