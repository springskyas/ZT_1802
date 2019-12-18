package com.net.chat;

import java.net.*;

public class ChatReceive implements Runnable {
	private DatagramSocket server;
	public ChatReceive(DatagramSocket server) {
		this.server=server;
	}
	
	@Override
	public void run() {
		try {
			byte[] buf = new byte[1024];
			DatagramPacket packet= new DatagramPacket(buf, buf.length);
			while (true) {
				server.receive(packet);
				String str = new String(packet.getData(),
								0, packet.getLength());
				System.out.println("收到" + packet.getAddress()
								+ ":" + packet.getPort() + "发送的数据:" + str);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
