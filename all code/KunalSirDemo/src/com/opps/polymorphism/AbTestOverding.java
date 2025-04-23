package com.opps.polymorphism;

public class AbTestOverding {

	public static void main(String[] args) {
		AOverrriding aOverrriding=new AOverrriding();
	System.out.println(	aOverrriding.toString());
	aOverrriding.m1();
	AOverrriding aOverrriding2=new BOverriding();
	aOverrriding2.m1();
	}

}
