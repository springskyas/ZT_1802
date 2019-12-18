package page001;

public class Operator {

	public static void main(String[] args) {
		//算术运算符
		int i=1;
		int j=1;
		System.out.println("后加 表达式i++="+(i++));
		System.out.println("先加 表达式++j="+(++j));
		System.out.println("不管做先加还是后加变量的值都加了1,i="+i);
		System.out.println("不管做先加还是后加变量的值都加了1,j="+j);
		//赋值运算符
		int a=2;
		a+=3;//等价于a=a+3;
		System.out.println(a);
		String s1="hello";
		String s2="hello";
		E02 e1=new E02();
		E02 e2=new E02();
		System.out.println(s1==s2);
		System.out.println(e1==e2);
		

	}

}
