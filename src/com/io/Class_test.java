package com.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Class_test {

	public static void main(String[] args) throws Exception {
		Path wj = Paths.get("D:\\班级信息.txt");
		Path bjmc = Paths.get("D:\\求班级编号.txt");
		Path bjbh = Paths.get("D:\\班级编号.txt");
		List<String> neirong = Files.readAllLines(bjmc);
		Files.createFile(bjbh);
		List<String> lines = Files.readAllLines(wj);
		List<String> names = Files.readAllLines(bjmc);
		for(String name : names) {
			for(String line : lines) {
				String[] zfcsz = line.split("\t");
				if(name.equals(zfcsz[1])) {
					System.out.println(zfcsz[0]);
					neirong.add(zfcsz[0]);
				}
			}
			Files.write(bjbh, neirong, StandardOpenOption.APPEND);
		}
		System.out.println("文件的大小为:" + Files.size(wj));
		System.out.println("文件中的内容为:" + lines);
		for(String line : lines) {
			String[] zfcsz = line.split("	");
			System.out.println("班级编号:" + zfcsz[0]);
			System.out.println("班级名称:" + zfcsz[1]);
		}
	}

}
