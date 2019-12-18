package com.inner_class;

@FunctionalInterface
interface Animal_1{
	void shout();
}

@FunctionalInterface
interface Animal_12{
	void shout();
}
class Cat implements Animal{
	
	@Override
	public void shout() {
		System.out.println("喵喵......");
	}
}
public class E21_1 {

	public static void main(String[] args) {
		//第一种方式:用具体Cat类的对象调用shout方法
		Cat cat=new Cat();
		cat.shout();
		//第二种方式:用匿名内部类的方式调用shout方法
		animalShout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println("汪汪......");
			}
		});
		//第三种方式:用lambda表达式调用shout方法
		animalShout(()->System.out.println("aow......"));
		showSum(10,20,(x,y) ->x+y);
	}

	private static void showSum(int x, int y, Calculate calculate) {
		System.out.println(x+"+"+y+"的和为:"+calculate.sum(x, y));
		
	}

	private static void animalShout(Animal animal) {
		animal.shout();
		
	}

}
