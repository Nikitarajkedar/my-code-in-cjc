package com.exceptionhandalling;

public class Demo {
int x=10;
	private void m1() {
	x=x/0;

}
	public static void main(String[] args) {
	System.out.println("main-start");	
  Demo d=new Demo();
  d.m1();   // hear we can not handal the exception that way our program give the exception
	System.out.println("main-end");
	}

}
