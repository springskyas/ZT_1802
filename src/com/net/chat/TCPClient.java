package com.net.chat;

import java.io.*;
import java.net.*;

public class TCPClient {

	public static void main(String[] args) throws Exception, IOException {
		//创建客户端套接字要带上服务器的IP
		Socket client = new Socket("10.2.103.31",8899);
		InputStream is = client.getInputStream();
		byte[] buf = new byte[1024];
		int len = is.read(buf);
		while (len != -1) {
			System.out.println(new String(buf, 0, len));
			len = is.read(buf);
		}
		is.close();
		client.close();
	}
	
}
