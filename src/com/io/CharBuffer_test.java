package com.io;

import java.nio.CharBuffer;

public class CharBuffer_test {

	public static void main(String[] args) {
		CharBuffer cbf = CharBuffer.allocate(6);
		System.out.println("这个字符缓冲区容量是:" + cbf.capacity());
		System.out.println("这个字符缓冲区界限值是:" + cbf.limit());
		System.out.println("这个字符缓冲区初始位置是:" + cbf.position());
		//添加3个元素
		cbf.put('x');cbf.put('y');cbf.put('z');
		System.out.println("添加3个元素以后这个字符缓冲区容量是:" + cbf.capacity());
		System.out.println("添加3个元素以后这个字符缓冲区界限值是:" + cbf.limit());
		System.out.println("添加3个元素以后这个字符缓冲区初始位置是:" + cbf.position());
		//执行反转方法
		cbf.flip();
		System.out.println("添加3个元素并反转之后这个字符缓冲区容量是:" + cbf.capacity());
		System.out.println("添加3个元素并反转之后这个字符缓冲区界限值是:" + cbf.limit());
		System.out.println("添加3个元素并反转之后这个字符缓冲区初始位置是:" + cbf.position());
		//取出第一个元素
		System.out.println("取出第一个元素值是:" + cbf.get());
		System.out.println("取出后的容量是:" + cbf.capacity());
		System.out.println("取出后的界限值是:" + cbf.limit());
		System.out.println("取出后的位置是:" + cbf.position());
		//执行clear()方法
		cbf.clear();
		System.out.println("执行clear()后的容量是:" + cbf.capacity());
		System.out.println("执行clear()后的界限值是:" + cbf.limit());
		System.out.println("执行clear()后的位置是:" + cbf.position());
		//取出第一个元素
		System.out.println("取出起一个元素是:" + cbf.get(0));
		System.out.println("取出后的容量是:" + cbf.capacity());
		System.out.println("取出后的界限值是:" + cbf.limit());
		System.out.println("取出后的位置是:" + cbf.position());
	}

}
