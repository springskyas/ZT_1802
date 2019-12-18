package page001;

import java.util.Scanner;

public class Fibonacci {
	public static int fib(int n) {
		int fn = 0;
		if (n == 1 || n == 2) {
			fn = 1;
		}else {
			fn = fib(n - 1) + fib(n - 2);
		}
		return fn;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int fn=fib(5);
		System.out.println("斐波那契数数列的第5个数的数值是"+fn);

	}

}
