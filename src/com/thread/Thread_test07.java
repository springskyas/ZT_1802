package com.thread;
class DamonThread implements Runnable{
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + "---在运行");
		}
	}
}
public class Thread_test07 {

	public static void main(String[] args) {
		System.out.println("main线程是后台线程吗?" + Thread.currentThread().isDaemon());
		DamonThread dt = new DamonThread();
		Thread thread = new Thread(dt, "后台线程");
		System.out.println("thread线程默认是后台线程吗?" + thread.isDaemon());
		thread.setDaemon(true);
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

}
