package com.java.extra;

public class WideningExample {
	
	public static void go(short s) {
		System.out.println("short");
	}
	
	public static void go(long l) {
		System.out.println("long");
	}
	
	public static void main(String[] args)
	{
	 go(5);
	
	}
}
