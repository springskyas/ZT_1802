package com.inner_class;

@FunctionalInterface
interface Calcable{
	int calc(int num);
}
//Math类已经实现了Calcable接口
class Math{
	public static int abs(int num) {
		if (num<0) {
			return -num;
		}else {
			return num;
		}
	}
}
public class E24 {

	public static void main(String[] args) {
		//Lambda表达式
		printAbs(-10,n->Math.abs(n));
		//类名应用静态方法
		printAbs(-10,Math::abs);

	}

	private static void printAbs(int num, Calcable calcable) {
		System.out.println(calcable.calc(num));
		
	}
	

}
