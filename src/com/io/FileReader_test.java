package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_test {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:\\reader.txt");
		FileWriter fw = new FileWriter("writer.txt");
		int len = 0;
		fw.write("轻轻的我走了,\r\n");
		fw.write("正如我轻轻的来;\r\n");
		fw.write("我轻轻的招手,\r\n");
		fw.write("作别西天的云彩.\r\n");
		
		char[] buff = new char[1024];
		while((len = fr.read(buff)) != -1) {
			fw.write(buff, 0, len);
		}
		
		int b = fr.read();
		while (b != -1) {
			System.out.print((char)b);
			b = fr.read();
		}
		fr.close();
		fw.close();
	}

}
