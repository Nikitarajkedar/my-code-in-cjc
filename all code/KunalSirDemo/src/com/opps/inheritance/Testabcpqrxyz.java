package com.opps.inheritance;

public class Testabcpqrxyz {
	public static void main(String[] args) {
		Xyz x=new Pqr();
		// x.m6();  becouse of m6 method is construct class method not parrent class so complier give error

		x.m1();
		x.m2();
		x.m3();
		System.out.println(x.a);

	
	
Pqr p =	new Pqr();
	
	System.out.println(p.a);
	p.m1();
	p.m2();
	p.m3();
	p.m4();
	p.m5();
	p.m6();
	System.out.println(p.a);
	}
}
