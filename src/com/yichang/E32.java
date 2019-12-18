package com.yichang;

public class E32 {

	public static void main(String[] args) {
		try {
			int result = divide(4,0);
			System.out.println(result);
		}catch(Exception e){
			System.out.println("捕获的异常信息为:"+e.getMessage());
		}

	}

	private static int divide(int x, int y) throws Exception {
		if(x==0) {
			throw new Exception("除数不能为0");
		}
		int result = x/y;
		return result;
	}

}
