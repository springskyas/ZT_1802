package com.thread;

import java.util.*;

public class Product_Consume01 {

	public static void main(String[] args) {
		ArrayList<Object> goods = new ArrayList<>();
		long start = System.currentTimeMillis();
		Thread thread1 = new Thread(()->{
			int num = 0;
			while (System.currentTimeMillis() - start <= 100) {
				goods.add("商品"+(++num));
				System.out.println("生产商品"+num);
			}
		},"生产者");
		Thread thread2 = new Thread(()->{
			int num = 0;
			while (System.currentTimeMillis() - start <= 100) {
				goods.remove("商品"+(++num));
				System.out.println("消费商品"+num);
			}
		},"消费者");
		thread1.start();
		thread2.start();
	}
	
}
