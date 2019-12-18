package com.net.chat;

import java.net.*;
import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入聊天服务当前启动端口号:");
		int serverPort = sc.nextInt();
		System.out.print("请输入聊天服务发送消息对象的目标端口号:");
		int targetPort = sc.nextInt();
		System.out.println("聊天系统初始化完全并启动!!!");
		try {
			DatagramSocket socket = new DatagramSocket(serverPort);
			new Thread(new ChatReceive(socket), "接受服务").start();
			new Thread(new ChatSend(socket, targetPort), "发送服务").start();
		}catch (SocketException e) {
			e.printStackTrace();
		}
	}

}
