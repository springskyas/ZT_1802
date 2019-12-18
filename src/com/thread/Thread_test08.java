package com.thread;

public class Thread_test08 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()
						+ "正在输出 i: " + i);
			}
		},"优先级较低的线程");
		Thread thread2 = new Thread(()->{
			for (int j = 0; j < 10; j++) {
				System.out.println(Thread.currentThread().getName()
						+ "正在输出 j: " + j);
			}
		},"优先级较高的线程");
		Thread thread3 = new Thread(new Runnable() {
			public void run() {
				for (int k = 0; k < 10; k++) {
					System.out.println(Thread.currentThread().getName()
							+ "正在输出k: " + k);
				}
			}
		},"优先级普通的线程");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(10);
		thread3.setPriority(10);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
