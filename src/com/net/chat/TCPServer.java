package com.net.chat;

import java.io.*;
import java.net.*;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(8899);
		while (true) {
			Socket client = serverSocket.accept();
			String ip = client.getInetAddress().getHostAddress();
			int port = client.getPort();
			System.out.println("和客户端ip地址是" + ip +",端口是" + port +"连接上了");
			@SuppressWarnings("unused")
			String xinxi = "客户端你好,来自服务的问候";
			OutputStream os = client.getOutputStream();
			os.write(("服务器端向客户端做出响应!").getBytes());
			Thread.sleep(5000);
			os.close();
			client.close();
		}
	}

}
