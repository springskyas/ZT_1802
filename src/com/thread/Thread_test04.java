package com.thread;
class TicketWindow extends Thread{
	private int tickets = 100000;
	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName()
						+ "正在发售第" + tickets --+ "张票");
			}
		}
	}
}
public class Thread_test04 {

	public static void main(String[] args) {
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
		new TicketWindow().start();
	}

}