package com.yichang;

public class E29 {

	public static void main(String[] args) {
		int result = divide(4,0);
		if(result == -1) {
			System.out.println("程序发生异常!");
		}else {
			System.out.println(result);
		}

	}

	private static int divide(int x, int y) {
		try {
			int result = x/y;
			return result;
		}catch(Exception e) {
			System.out.println("捕获的异常信息为:"+e.getMessage());
		}finally {
			System.out.println("无论如何都要执行finally代码块");
		}
		return -1;
	}

}
