package com.inner_class;

@FunctionalInterface
interface Animal{
	void shout();
}

interface Calculate{
	int sum(int a,int b);
}
public class E21 {

	public static void main(String[] args) {
		String name = "小花";
		animalShout(new Animal() {
			public void shout() {
				System.out.println(name+"喵喵......");
			}
		});
		
	}
	
	private static void animalShout(Animal animal) {
		animal.shout();
		
	}

}
