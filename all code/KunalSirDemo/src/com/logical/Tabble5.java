package com.logical;

import java.util.Scanner;

public class Tabble5 {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter the no.");
int num=sc.nextInt();

		int i=1;
		while(i<=10){
			System.out.println(i*num);
			
			i++;
		}
	
		sc.close();
	}
	

}
