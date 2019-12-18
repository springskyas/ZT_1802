package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Test01 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("D:\\src.txt");
		FileOutputStream out = new FileOutputStream("D:\\des1.txt");
		byte[] buf = new byte[1024];
		int len;
		while((len = in.read(buf))!= -1) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
		
		BufferedReader bf = new BufferedReader(new FileReader("D:\\src.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\des2.txt"));
		String str;
		while((str = bf.readLine()) != null) {
			bw.write(str);
			bw.newLine();
		}
		bf.close();
		bw.close();
	}

}
