package com.thread;

import java.util.concurrent.*;

class MyThread3 implements Callable<Object>{
	public Object call() throws Exception{
		int i = 0;
		while (i ++< 5) {
			System.out.println(Thread.currentThread().getName()
					+ "的call()方法在运行");
		}
		return i;
	}
}
public class Thread_test03 {

	public static void main(String[] args) throws InterruptedException,
												  ExecutionException {
		MyThread3 myThread3 = new MyThread3();
		FutureTask<Object> ft1 = new FutureTask<>(myThread3);
		Thread thread1 = new Thread(ft1, "thread1");
		thread1.start();
		FutureTask<Object> ft2 = new FutureTask<>(myThread3);
		Thread thread2 = new Thread(ft2, "thread2");
		thread2.start();
		FutureTask<Object> ft3 = new FutureTask<>(myThread3);
		Thread thread3 = new Thread(ft3, "thread3");
		thread3.start();
		System.out.println("thread1返回结果:" + ft1.get());
		System.out.println("thread2返回结果:" + ft2.get());
		System.out.println("thread3返回结果:" + ft3.get());
	}

}
