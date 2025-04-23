package com.array;

import java.util.Arrays;

public class ArrayDemo {
public static void main(String[] args) {
	int a[];
	a=new int[3];
	String s[]=new String[] {"Santosh","Nikita","Mahi"};
	a[0]=1;
	a[1]=2;
	a[2]=3;
	System.out.println(Arrays.toString(a));
	System.out.println(s[1]);// Randomly access  element
	
	System.out.println("*****Array itarate with for each loop*****");
	for(String a1:s) {
		System.out.println(a1);
	}
	System.out.println(a); // Represent the address that way not display no. 
	System.out.println("*****Array itarate with for loop*****");
	for (int i = 0; i < a.length; i++) { //length is variable in array and length()is method in string class
		System.out.println(a[i]);

		
	}
			}
}
