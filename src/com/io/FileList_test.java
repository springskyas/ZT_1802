package com.io;

import java.io.File;

public class FileList_test {

	public static void main(String[] args) {
		new File("D:\\新建文件夹\\001.txt");
		
		//2.
		/*if(file.isDirectory()) {
			String[] fileName = file.list(( dir, name)->name.endsWith(".java"));
			Arrays.stream(fileName).forEach(f ->System.out.println(f));
		}*/
		
		//3.
		/*fileDir(file);*/
		
		//4.
		//deleteDir(files);
	}
	
	//3.
	/*private static void fileDir(File file) {
			File[] listFiles = file.listFiles();
			//foreach
			
			for(File files : listFiles) {
				if(files.isDirectory()) {
					fileDir(files);
				}
				System.out.println(files);
			}
			
			
			
		}*/
	//4.
	/*private static void deleteDir(Object files) {
		file[] listFiles = files.listFiles();
		for(File file : listFiles) {
			if(file.isDirectory()) {
				deleteDir(file);
			}
			file.delete();
		}
			((File) files).delete();*/
	}
	
	

