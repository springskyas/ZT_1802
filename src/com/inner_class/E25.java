package com.inner_class;
//定义一个函数式接口
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25 {

	public static void main(String[] args) {
		StringUtils stu = new StringUtils();
		printUpper("Hello", t->stu.printUpperCase(t));
		printUpper("World",stu::printUpperCase);

	}

	private static void printUpper(String text, Printable pt) {
		pt.print(text);
		
	}

}
