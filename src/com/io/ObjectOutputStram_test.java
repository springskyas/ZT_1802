package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStram_test {
	
	public static void main(String[] args) throws Exception {
		//对象输出流
		@SuppressWarnings("resource")
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\obj.txt"));
		Person p1 = new Person("Mile", 40);
		out.writeObject(p1);
		//对象输入流
		@SuppressWarnings("resource")
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\obj.txt"));
		Person person = (Person)in.readObject();
		System.out.println("name:  " + person.getName());
		System.out.println("age:  " + person.getAge());
	}
	
	

}
