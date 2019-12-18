package com.api;

public class E506 {

	public static void main(String[] args) {
		String str="2019-10-12";
		System.out.println("从第6个字符截取到末尾的结果:" +str.substring(5));
		System.out.println("从第6个字符截取到第7个字符的结果:" +str.substring(5,7));
		
		System.out.println("今年是:" +str.substring(0,4));
		System.out.println("本月是:" +str.substring(5,7));
		System.out.println("今日是:" +str.substring(8));
		//split方法将字符串通过制定的分隔符进行分割,得到一个字符串数组
		String[] zfcsz=str.split("-");
		System.out.println("今天是" +zfcsz[0]+ "年" +zfcsz[1] +"月" +zfcsz[2] +"日");
		
		System.out.println("分割后的字符串数组中的元素依次为:");
		String[] strArray = str.split("-");
		
		for(int i=0; i<strArray.length; i++) {
			if(i !=strArray.length-1) {
				System.out.println(strArray[i]+"、");
			}else {
				System.out.println(strArray[i]);
			}
		}
	}

}
