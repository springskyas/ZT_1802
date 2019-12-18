package com.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test02 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String password = "";
		boolean b = false;
		for(int i = 0; i < 5; i++) {
			System.out.println("请输入密码:");
			password = br.readLine();
			if(password.equals("123456")) {
				System.out.println("恭喜你进入游戏!");
				b = true;
				break;
			}
		}
		if(!b) {
			System.out.println("密码错误,游戏结束!");
			System.exit(0);
		}
	}

}
