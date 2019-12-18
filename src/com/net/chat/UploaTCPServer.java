package com.net.chat;

import java.io.*;
import java.net.*;

class ServerThread implements Runnable{
	private Socket socket;
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		String ip = socket.getInetAddress().getHostAddress();
		int count = 1;
		try {
			File parentFile = new File("");
			if(!parentFile.exists()) {
				parentFile.mkdir();
			}
			File file = new File(parentFile, ip + "(" + count + ").jpg");
			while (file.exists()) {
				file = new File(parentFile, ip + "(" + (count++) + ").jpg");
			}
			InputStream in = socket.getInputStream();
			FileOutputStream fos = new FileOutputStream(file);
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = in.read(buf)) !=-1) {
				fos.write(buf, 0, len);
			}
			OutputStream out = socket.getOutputStream();
			out.write("上传成功".getBytes());
			in.close();
			fos.close();
			socket.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class UploaTCPServer {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(10001);
		while (true) {
			Socket client = serverSocket.accept();
			new Thread(new ServerThread(client)).start();
		}
	}

}
