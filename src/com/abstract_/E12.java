package com.abstract_;
//定义抽象类Animal
abstract class Animal{
	//定义抽象方法shout()
	public abstract void shout();
}
//定义Dog类继承抽象类Animal
class Dog extends Animal{
	@Override
	//定义抽象方法shout(),编写方法体
	public void shout() {
		System.out.println("汪汪......");
	}
}

class Cat extends Animal{
	@Override
	public void shout() {
		System.out.println("喵喵......");
	}
}
//定义测试类
public class E12 {

	public static void main(String[] args) {
		Dog dog=new Dog();		//创建Dog类的实例对象
		dog.shout();			//调用dog对象的shout()方法
		Cat cat=new Cat();
		cat.shout();
	}

}
