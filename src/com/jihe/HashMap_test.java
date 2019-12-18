package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		//赋值符号左边的类或接口可以是右边的类的上一代
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		map.put("4", "Pete");
		map.put("1", "Tom");
		System.out.println(map);
		//
		System.out.println(map.containsKey("1"));
		//
		System.out.println(map.get("1"));
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		//将双列集合Map变成单列的值对象集合使用values()方法
		System.out.println(map.keySet());
		System.out.println(map.values());
		//将键为1的值改为Tom2
		map.replace("1", "Tom2");
		System.out.println(map);
		//删除键1对应的键key值+value=对entry
		map.remove("1");
		System.out.println(map);
		
		
		if (map.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
		}
		System.out.println("这个双列集合包中键1的值是:" +map.get("1"));
		
		
		System.out.println("用键集遍历双列集合的键和值");
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		Set<String> jianji = map.keySet();
		Iterator<String> diedai = jianji.iterator();
		while (diedai.hasNext()) {
			Object key = diedai.next();
			Object value = map.get(key);
			System.out.println(key + ":" +value);
		}
		
		System.out.println("用键值对集遍历双列集合的键和值");
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		Set<Map.Entry<String, String>> jianzhiduiji = map.entrySet();
		Iterator<Map.Entry<String, String>> diedai2 = jianzhiduiji.iterator();
		while (diedai2.hasNext()) {
			Entry<String, String> jianzhidui = diedai2.next();
			Object key = jianzhidui.getKey();
			Object value = jianzhidui.getValue();
			System.out.println(key + ":" +value);
		}
		
		System.out.println("用foreach键值对集遍历双列集合的键和值");
		map.forEach((key,value)->System.out.println(key+":"+value));
		
		System.out.println("用foreach键值对集遍历双列集合的所有值");
		Collection<String> zhiji = map.values();
		zhiji.forEach(value->System.out.println(value));
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(2, "Jack");
		map2.put(1, "Rose");
		map2.put(4, "Lucy");
		map2.put(3, "Pete");
		map2.put(1, "Tom");
		map2.forEach((key,value)->System.out.println(key+":"+value));
	}

}
