package com.net.chat;

import java.io.*;
import java.net.*;

public class UploadTCPClient {

	public static void main(String[] args) throws Exception, Exception {
		Socket client = new Socket("10.2.103.31", 8899);
		OutputStream out = client.getOutputStream();
		FileInputStream fis = new FileInputStream("D:\\1.jpg");
		byte[] buf = new byte[1024];
		int len = 0;
		System.out.println("连接到服务器端,开始文件上传!");
		while ((len = fis.read()) != -1) {
			out.write(buf, 0, len);
		}
		client.shutdownOutput();
		InputStream is = client.getInputStream();
		byte[] bufMsg = new byte[1024];
		int len2 = is.read();
		while(len2 !=-1) {
			System.out.println(new String(bufMsg, 0, len2));
			len2 = is.read(bufMsg);
		}
		out.close();
		is.close();
		fis.close();
		client.close();
	}

}
