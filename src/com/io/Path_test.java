package com.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_test {

	public static void main(String[] args) {
		//Paths:工具类	Path:路径接口
		Path path = Paths.get("E:\\2019下学期\\Java基础入门");
		System.out.println("path的根路径:" + path.getRoot());
		System.out.println("path的父路径:" + path.getParent());
		System.out.println("path中的路径名称数:" + path.getNameCount());
		for (int i = 0; i < path.getNameCount(); i++) {
			Path name = path.getName(i);
			System.out.println("索引为" + i +"的路径的名称为:" + name);
		}
		System.out.println("path的URI路径为:" + path.toUri());
		System.out.println("path的绝对路径:" + path.toAbsolutePath());
	}

}