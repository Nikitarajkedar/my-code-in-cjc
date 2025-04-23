package com.logical;

import java.util.Scanner;

public class Oparater {
	public static void main(String[] args) {

		int a,b;
		Scanner scanner=new  Scanner(System.in);

		System.out.println("enter frist no :");
		a=scanner.nextInt();
		System.out.println("enter second no :");
		b=scanner.nextInt();


		//System.out.println(a+b);
		if (a>100 ) {
			if(b>100)
			{
				System.out.println(a+b);
			}
			else {
				System.out.println("b is less than 100");
			}
			
		}
		else {
			System.out.println("a is less than  100");
		}
		

scanner.close();



	}
}
