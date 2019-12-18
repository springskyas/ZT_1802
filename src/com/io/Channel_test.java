package com.io;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Channel_test {

	public static void main(String[] args) throws Exception {
		//源文件
		RandomAccessFile infile = new RandomAccessFile("D:\\scr.jpg", "rw");
		//获取源通道
		FileChannel inChannel = infile.getChannel();
		//目标文件
		RandomAccessFile outfile = new RandomAccessFile("D:\\scr2.jpg", "rw");
		//获取目标通道
		FileChannel outChannel = outfile.getChannel();
		//执行复制
		long transferTo = inChannel.transferTo(0, inChannel.size(), outChannel);
		if(transferTo > 0) {
			System.out.println("复制成功!");
		}
		infile.close();
		inChannel.close();
		outfile.close();
		outChannel.close();
	}

}
