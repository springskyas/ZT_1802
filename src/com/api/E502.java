package com.api;

public class E502 {

	public static void main(String[] args) {
		String s = "abcabcbacdba";
		System.out.println("字符串的长度:" +s.length());
		System.out.println("字符串中第一个字符:" +s.charAt(0));
		System.out.println("字符c第一次出现的位置:" +s.indexOf('c'));
		System.out.println("字符c最后一次出现的位置:" +s.lastIndexOf('c'));
		System.out.println("子字符串第一次出现的位置:" +s.indexOf("ab"));
		System.out.println("子字符串最后一次出现的位置:" +s.lastIndexOf("ab"));

	}

}
