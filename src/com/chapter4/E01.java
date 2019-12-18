package com.chapter4;
class Animal{
	//定义动物叫的方法
	void shout() {
		System.out.println("动物发出叫声");
	}
}
//定义Dog类继承Animal类
class Dog extends Animal{
	//定义狗叫的方法
	void shout() {
		System.out.println("汪汪汪......");
	}
}
//定义测试类
public class E01 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();

	}

}
