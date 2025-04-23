package com.opps.inheritance;

public class MethodSuperThisB extends MethodSuperThisA {
@Override
void m1() {
	
	System.out.println("m1-B");
}
void m2() {
	this.m1();
	super.m1();
}
}
