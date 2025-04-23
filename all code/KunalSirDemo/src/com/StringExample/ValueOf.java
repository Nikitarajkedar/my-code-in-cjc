package com.StringExample;

public class ValueOf {
	public static void main(String[] args) {
		//valueOf(): convert primitive data type into String

		int a=10;

		String str=String.valueOf(a);
		System.out.println(str);
		//	String b=str+str;
		//	System.out.println(b);
		String s=String.valueOf(false);
		System.out.println(s);
	
//		10
//		false
	}	
}

