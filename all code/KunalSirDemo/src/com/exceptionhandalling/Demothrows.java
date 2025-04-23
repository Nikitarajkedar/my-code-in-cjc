package com.exceptionhandalling;

public class Demothrows {
	 int  x=10;
	 void  m1() throws ArithmeticException,NullPointerException{
		x=x/0;	// when we divide by 0 then arithmatic exception will occure or % by 0 also occure
		
	 }
	
	void m2() {
		try {
			m1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main-start");
		Demothrows demo=new Demothrows();
		//System.out.println(x);
		demo.m2();
		
		System.out.println("main-end");
		

	}

}
