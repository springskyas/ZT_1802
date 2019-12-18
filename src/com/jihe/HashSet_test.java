package com.jihe;

import java.util.HashSet;

class Student {
	String id;
	String name;
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student stu = (Student) obj;
		boolean b = this.id.equals(stu.id);
		return b;
	}	
	@Override
	public String toString() {
		return id + ":" + name;
	}
	
}
public class HashSet_test {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		@SuppressWarnings("unused")
		Student stu1 = new Student("1","Jack");
		@SuppressWarnings("unused")
		Student stu2 = new Student("2","Rose");
		@SuppressWarnings("unused")
		Student stu3 = new Student("2","Rose");
		hs.add("stu1");
		hs.add("stu2");
		hs.add("stu3");
		System.out.println(hs);

	}

}
