package com.opps.polymorphism;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
//		1.create a class bank and use the return type method to 
//		return the interestrate and override the method in SBI
//		class and in  main method create a object with reference as bank and
//		class as SBI and call the method  ----Method running rule           
Scanner sc=new Scanner(System.in);
Bank b=new SBI();
//SBI s =new SBI();
//System.out.println("enter interestrate ");
//s.setInterestrate(sc.nextInt());
//System.out.println(s.getInterestrate());

System.out.println("enter interestrate ");
b.setInterestrate(sc.nextInt());
System.out.println(b.getInterestrate());
	
	}

}
