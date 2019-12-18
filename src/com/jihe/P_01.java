package com.jihe;

import java.util.HashSet;

class Person{
	String name;
	int age;
	public Person(String name,int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int hashCode() {
		return name.hashCode();
	}
	public boolean aquals(Object obj) {
		if(this == obj)
			return true;
		if(obj ==null)
			return false;
		Person other = (Person) obj;
		return other.name.equals(this.name);
	}
}
public class P_01 {

	public static void main(String[] args) {
		HashSet<Person> hashSet = new HashSet<Person>();
		Person p1 = new Person("Jack",25);
		Person p2 = new Person("Rose",23);
		Person p3 = new Person("Jack",27);
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		for(Object obj : hashSet) {
			Person p = (Person) obj;
			System.out.print(p.name +":"+ p.age+"  ");
		}
		
}

}
