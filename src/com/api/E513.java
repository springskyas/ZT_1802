package com.api;

import java.io.IOException;

public class E513 {

	public static void main(String[] args) /*throws Exception*/{
		Runtime rt =Runtime.getRuntime();
		Process process = null;
		try {
			process = rt.exec("notepad.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		process.destroy();
	}

}
