package com.api;

public class Jssj {

	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		int sum=0;
		for(int i = 0; i < 1000000000; i++) {
			sum +=i;
		}
		long endTime =System.currentTimeMillis();
		System.out.println("程序运行时间为:" +(endTime-kssj)+"毫秒");

	}

}
