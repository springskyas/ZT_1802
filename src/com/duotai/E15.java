package com.duotai;
abstract class Animal{
	abstract void shout();
}
class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵喵......");
	}
}
class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪汪......");
	}
}
public class E15 {

	public static void main(String[] args) {
		Animal cat=new Cat();
		Animal dog=new Dog();
		cat.shout();
		dog.shout();

	}

}
