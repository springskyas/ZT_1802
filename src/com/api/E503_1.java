package com.api;

public class E503_1 {

	public static void main(String[] args) {
		String str="java";
		char[] charArray=str.toCharArray();
		System.out.println("将字符串转换为字符数组的遍历结果:");
		for(int i=0; i<charArray.length; i++) {
			if(i !=charArray.length -1) {
				System.out.println(charArray[i]+',');
			}else {
				System.out.println(charArray[i]);
			}
		}
		System.out.println("将int值转换为String类型之后的结果:" +String.valueOf(12));
		System.out.println("将字符串转换成大写之后的结果:" +str.toUpperCase());

	}

}
