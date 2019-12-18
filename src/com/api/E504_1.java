package com.api;

public class E504_1 {

	public static void main(String[] args) {
		String s1="1k4h45我hy6k3v爱b54jh你6d中h国j413545";
		System.out.println("这个字符里的数字是:");
		//将字符串打碎成字符数组
		char[] zfsz=s1.toCharArray();
		//foreach循环:对于字符数字里的每个字符、
		//冒号前面是集合或者数组里的每个单个元素,冒号后面是集合或者数组
		for(char zf : zfsz) {
			if(zf >='0'&&zf<='9') {
				System.out.print(zf+",");
			}
		}
		System.out.println("\n这个字符里的汉字是:");
		//将字符串打碎成字符数组
		//foreach循环:对于字符数字里的每个字符、
		//冒号前面是集合或者数组里的每个单个元素,冒号后面是集合或者数组
		for(char zf : zfsz) {
			if(zf >='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf+"");
			}
		}

	}
}


