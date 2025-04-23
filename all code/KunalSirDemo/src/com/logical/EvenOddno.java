package com.logical;

import java.util.Scanner;

public class EvenOddno {
public static void main(String[] args) {
	int a;
	Scanner scanner=new  Scanner(System.in);

	System.out.println("enter frist no :");
	a=scanner.nextInt();
	
	if(a%2==0) {
		System.out.println(a+" is even no.");
	}
	else System.out.println(a+" is odd no");
	 scanner.close();
	
}
}
