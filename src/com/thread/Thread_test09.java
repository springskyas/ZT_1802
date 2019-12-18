package com.thread;

public class Thread_test09 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()
						+ "正在输出 i: " + i);
				if(i == 2) {
					try {
						Thread.sleep(500);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread thread2 = new Thread(()->{
			for (int j = 0; j < 10; j++) {
				System.out.println(Thread.currentThread().getName()
						+ "正在输出 j: " + j);
			}
		});
		thread1.start();
		thread2.start();
	}

}
