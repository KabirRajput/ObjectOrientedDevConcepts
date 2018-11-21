package com.java.extra;

public class VarArgs {
	
	public static int add(int...nums) {
		int total = 0;
		for(int num : nums) {
			total += num;
		}
		return total;
	}
	
	//public static void example(String s,int x,float y,int...z) {
	
	public static void main(String[] args) {
		
		int result = add(5,6);
		
		result = add(5,6,7);
		System.out.println(result);
	}

}
