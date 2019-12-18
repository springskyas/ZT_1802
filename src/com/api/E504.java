package com.api;

public class E504 {

	public static void main(String[] args) {
		String s="	http://localhast	:	8080		";
		System.out.println("去除字符串两端空格后的结果:" +s.trim());
		System.out.println("去除字符串中所有空格后的结果:" +s.replace("	",""));
		
		System.out.println("字符串去掉所有的空格以后是:"+s.replaceAll("\\s+",	""));

	}

}
