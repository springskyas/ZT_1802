package com.api;

import java.util.Random;

public class Ssq {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("双色球开奖:");
		System.out.println("六个红球号码是:");
		Random r = new Random();
		for(int i = 0; i < 6; i++) {
			int hq=r.nextInt(33)+1;
			System.out.print(hq+"  ");
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println("一个蓝球号码是:");
		Random r1 = new Random();
		int lq=r.nextInt(33)+1;
		System.out.print(lq+"  ");
		Thread.sleep(1000);
	}

}
