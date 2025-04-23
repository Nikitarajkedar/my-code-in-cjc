package com.StringExample;

public class Contains {
public static void main(String[] args) {

// contains("a"): it is uesd to check whethar string is present or not in String present then print true other vise false	
	
String s="java";
// System.out.println(s.contains('a'));//s.contains('a') is incorrect because contains() expects a String, not a char.
// 'a' is a char, but contains() requires a String.

System.out.println(s.contains("a"));
}
}
