package page001;

public class E04 {
	// ctrl+shift+f
	public static void main(String[] args) {
		//字面上的整型常量
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+0306);
		//0123456789abcdef
		System.out.println("十六进制以0x开头"+0xc6);
		//字面上的浮点型常量
		System.out.println("单精度浮点以f结尾"+5.022e+6f);
		System.out.println("双精度浮点以d结尾"+5.022e+6d);
		System.out.println("双精度浮点d可以省略"+5.022e+6);
		//Java中的字符使用单引号，采用16位unicode编码，用//uXXXX来表示
		System.out.println("我的名字"+'\u9648'+'\u65b0');
		//Java中的字符串常量使用双引号括起来
		System.out.println("Hello.\nSeptember!");
		//Java中的布尔常量只有两个，真ture，假false
		System.out.println("布尔型常量"+true+"或者"+false);
		//Java中的null常量，只能是引用数据类型
		System.out.println("null常量只有一个"+null+",表示空对象");
		//int c=null;
		E04 changliang=null;
		//同变量类似的常量要使用final关键字，常量被赋值后不能再次被修改，常量一般用大写
		final int A=5;//定义一个整型变量A，如果前面加final修饰它就变成一个常量
	}

}
