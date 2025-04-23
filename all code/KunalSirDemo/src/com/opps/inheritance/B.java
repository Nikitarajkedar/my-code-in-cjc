package com.opps.inheritance;


public class B extends A {
	int  a=9;
	public void m2() {
		//A a=new A();
		System.out.println(a);
		m1();
		System.out.println("B--m2");
		System.out.println(this.a);


	}

}

