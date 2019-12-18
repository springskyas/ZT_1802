package page001;

public class E05 {

	public static void main(String[] args) {
		int x=0,y=0,z=0;
		boolean a,b;
		a=x>0 & y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		
		b=x>0 && z++>1;				//逻辑运算符&&对表达式进行运算，然后将结果赋值给b
		System.out.println("b="+b);
		System.out.println("z="+z);
		//条件运算符
		int store=105;
		System.out.println(store <=0 ? "没有库存啦！" :store>100? "库存多了！" :"库存存量:"+store);
	}

}
