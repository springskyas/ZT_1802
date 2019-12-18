package com.jihe;

import java.util.ArrayList;
import java.util.HashSet;


public class Set_test {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		arrayList.add("stud4");
		System.out.println("来自数组列表的输出:");
		arrayList.forEach(obj->System.out.println(obj));

		//HashSet能够去掉重复元素,是因为HashSet里的String类已经重写了Object类的hashCode()以及equals()方法
		
		HashSet<String> hset = new HashSet<String>();
		hset.add(new String("Jack"));
		hset.add(new String("Eve"));
		hset.add(new String("Rose"));
		hset.add(new String("Rose"));
		hset.add(new String("Pete"));
		System.out.println("来自哈希集的输出:");
		hset.forEach(obj->System.out.println(obj));
		
		//HashSet能够去掉重复元素,是因为HashSet里的Intriguer类已经重写了Object类的hashCode()以及equals()方法
		hset.removeAll(hset);
		hset.add("1");
		hset.add("2");
		hset.add("3");
		hset.add("4");
		hset.add("5");
		hset.add("5");
		System.out.println("来自哈希集的输出:");
		hset.forEach(obj->System.out.println(obj));
	}

}
