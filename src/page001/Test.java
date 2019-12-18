package page001;

public class Test {
	//构造方法的重载overload
	public Test() {
		System.out.println("构造方法一被调用");	
	}
	public Test(int x) {
		//this关键字在这里指代本类
		this();
		System.out.println("构造方法二被调用");
	}
	public Test(boolean b) {
		this(1);
		System.out.println("构造方法三被调用");
	}
	public void openMouth() {}
	public void Speak() {this.openMouth();}
	public static void main(String[] args) {
		new Test(true);
	}

}
