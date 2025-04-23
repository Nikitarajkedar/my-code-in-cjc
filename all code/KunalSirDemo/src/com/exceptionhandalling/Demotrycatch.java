package com.exceptionhandalling;

public class Demotrycatch {
	int  a=10;
	int b=0;
	int c ;
	private void m1() {
		try {
		c=a%b;	
		} catch (ArithmeticException e) {
		System.out.println(e.getMessage());	
		}
       }
	public static  void main(String arg[]) {
		Demotrycatch demotrycatch=new Demotrycatch();
		demotrycatch.m1();
	}
}
