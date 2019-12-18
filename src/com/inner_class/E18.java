package com.inner_class;

class Outer{
	static int m = 0;
	static //定义外部类成员方法
	void test1() {
		System.out.println("外部类成员方法");
	}

	static class Inner{
		int n = 1;
		//1.定义内部类方法,访问外部类成员变量和方法
		void show1() {
			System.out.println("外部类成员变量m="+m);
			test1();
		}
		void show2() {
			System.out.println("内部类成员方法");
		}
	}
	//2.定义外部类方法,访问内部类变量和方法
	void test2() {
		@SuppressWarnings("hiding")
		class Inner{
			int n = 1;
			//1.定义内部类方法,访问外部类成员变量和方法
			@SuppressWarnings("unused")
			void show1() {
				System.out.println("外部类成员变量m="+m);
				test1();
			}
			void show2() {
				System.out.println("内部类成员方法");
			}
		}
		Inner inner =new Inner();
		System.out.println("内部类成员变量n="+inner.n);
		inner.show2();
	}
}
//定义测试类
public class E18 {

	public static void main(String[] args) {
		Outer outer=new Outer();					//创建外部类对象
		Outer.Inner inner=new Outer.Inner();		//创建内部类对象
		inner.show1();
		outer.test2();

	}

}
