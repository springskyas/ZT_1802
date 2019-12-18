package com.jihe;

import java.util.LinkedList;

public class E602 {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.add("stu1");
		link.add("stu2");
		System.out.println(link);
		
		link.offer("offer");
		link.push("push");
		System.out.println(link);
		
		Object object = link.peek();
		System.out.println(object);
		
		link.removeFirst();
		link.pollLast();
		System.out.println(link);

	}

}
