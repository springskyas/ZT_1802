package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReader_test {

	public static void main(String[] args) throws Exception {
		// 定义标准字节输入流
		//InputStream jpsr = System.in;
		// 将标准字节输入 流转换成字符流
		//InputStreamReader ir = new InputStreamReader(jpsr);
		// 将字符流包装成缓冲字符流
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("profile.txt")));
		
		/*System.out.println("自我介绍:");
		String line = br.readLine();
		bw.write(line);
		int i = 1;
		while (line != "Quit") {
			if (i==1) {*/
				System.out.println("请输入你的姓名:");
				
				String line = br.readLine();
				bw.write("你叫" +line);
				br.close();
				bw.flush();
				bw.close();
				/*bw.write("请输入你的姓名:");
				line = br.readLine();
				bw.write("你叫" + line);
				i++;
			}else if(i == 2){
				System.out.println("请输入你的年龄:");
				bw.write(cbuf);
				line = br.readLine();
				int age = Integer.parseInt(line);
				System.out.println(line);
				System.out.println("你明年将是:" +(age + 1) +"岁");
			}
			i++;
		}*/
		/*int age = Integer.parseInt(line);
		System.out.println("你明年将是:" +(age + 1) +"岁");*/
	}


}
