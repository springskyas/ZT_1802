package com.jihe;

public class Foreach {
	static String[] strs= {"aaa","bbb","ccc"};
	public static void main(String[] args) {
		//foreach閬嶅巻骞朵慨鏀规暟缁勪腑鐨勫厓绱�,鍙互鍚�?涓嶅彲浠�.
		for(@SuppressWarnings("unused") String mgys:strs) {
			mgys="ddd";
		}
		System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" ");
		//for閬嶅巻骞朵慨鏀规暟缁勪腑鐨勫厓绱�,鍙互鍚�?鍙互.
		for(int i=0;i<strs.length;i++) {
			strs[i] = "ddd";
		}
		System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" ");
	}

}
