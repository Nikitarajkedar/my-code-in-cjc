package com.logical;

import java.util.Scanner;

public class Largestno {
public static void main(String[] args) {
	Scanner scanner=new  Scanner(System.in);

	System.out.println("enter frist no :");
	int a=scanner.nextInt();
	System.out.println("enter second no :");
	int b=scanner.nextInt();
if(a>b) {
	System.out.println("lagest no is :"+a);
}else if(a==b)
	System.out.println("a and b is equal...."+a);
else 
	System.out.println("lagest no is :"+b);
scanner.close();

}
}
