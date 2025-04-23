

package com.opps.inheritance;

public class TestA1B1C1D1 {
	public static void main(String[] args) {

		A1 a=new A1();
		A1 a1=new B1();
		A1 a2=new C1();
		A1 a3=new D1();

		a.m1();
		a.m2();

		a1.m1();
		a1.m2();
		
		a2.m1();
		a2.m2();
		
		a3.m1();
		a3.m2();
		
		B1 b=new B1();
		B1 b1=new C1();
		B1 b2=new D1();

		b.m1();
		b.m2();
		b.m3();
		
		b1.m1();
		b1.m2();
		b1.m3();

		b2.m1();
		b2.m2();
		b2.m3();
		
		C1 c=new C1();
		C1 c1=new D1();
		
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		
		D1 d=new D1();
		
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		
		
		
		
	}

}
