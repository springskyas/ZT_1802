package com.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("张小明");
		list.add("张阳");
		
		//把集合变成流
		Stream<String> stream = list.stream();
		Stream<String> stream2 = stream.filter(i->i.startsWith("张"));
		Stream<String> stream3 = stream2.limit(3);
		stream3.forEach(j->System.out.println(j));
		System.out.println("=======");
		list.stream().filter(i->i.startsWith("张")).skip(1).limit(2).forEach(j->System.out.println(j));
		
		System.out.println("集合里第二和第三个姓张的人:");
		list.stream().filter(k->k.startsWith("张")).skip(1).limit(2).forEach(j->System.out.println(j));
		
		System.out.println("集合里第二和第三个姓张的人用和链接:");
		String string = list.stream().filter(k->k.startsWith("张")).skip(1).limit(2).collect(Collectors.joining(","));
		System.out.println(string);
	}

}
