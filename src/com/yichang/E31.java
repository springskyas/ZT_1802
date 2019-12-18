package com.yichang;

public class E31 {
	
	 public static int divide(int x, int y) throws Exception {
		if(x==0) {
			throw new Exception("除数不能为0");
		}
		int result = x/y;
		return result;
	}
	
	public static void main(String[] args) throws Exception {

		int result =divide(4,0);
		System.out.println(result);

	}



}
