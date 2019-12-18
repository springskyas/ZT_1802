package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_test {

	public static void main(String[] args) {
		//<>是泛型,里面的类型是集合里元素的类型
		//有两个类,前面一个是集合类,后面尖括号里的集合里元素类型
		ArrayList<String> list = new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		list.add("");
		System.out.println("集合的长度:" +list.size());
		System.out.println("第2个元素是:" +list.get(1));
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("stu1");
		linkedList.add("stu2");
		linkedList.add("offer");
		linkedList.add("push");
		
		System.out.println("集合的长度:" +linkedList.size());
		System.out.println("第1个元素是:" +linkedList.getFirst());
		System.out.println("最后一个元素是:" +linkedList.getLast());
		System.out.println(linkedList);
		
		String dygys = linkedList.peek();
		System.out.println("链表linkedList的第一个元素是:" +dygys);
		
		linkedList.removeFirst();
		linkedList.pollFirst();
		System.out.println(linkedList);
	}

}
