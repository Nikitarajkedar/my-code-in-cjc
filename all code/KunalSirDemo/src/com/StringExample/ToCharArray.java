package com.StringExample;

import java.util.Arrays;

public class ToCharArray {
	public static void main(String[] args) {
		//toCharArray(): it is uesd to convert string into char array
		
		//Arrays.toString() is used to convert an array into a human-readable string representation. 
		// By default, printing an array using System.out.println(array) will print an object reference instead of the actual elements.	//[j, a, v, a]

		
		String s="java";
		char c[]=s.toCharArray(); // in hear we create do the converson 
		System.out.println(c);//java

		String  a=Arrays.toString(c);
		System.out.println(a);//[j, a, v, a]
		
		//char aaray print with help of for loop
		int count = 0;
		System.out.print("[");	
		for (int i = 0; i < c.length; i++) {
		System.out.print(" "+c[i]+",");	
		count++;
		}
		System.out.print("]");	
		System.out.println();
		System.out.println("charecter in string:"+count);
		for (int i = 0; i < c.length; i++) {
			System.out.println(i+":"+c[i]);
		}
		
		//	float[] f= {10.2f,23.3f,23.0f};
		//  System.out.println(Arrays.toString(f)); //[10.2, 23.3, 23.0]
		//	System.out.println(f[1]); // f of 1 is 23.3 or only f is address
		//	System.out.println(f);     //f have address of object or refrance  that way print  address only  o/p :[F@378fd1ac
		//	for (int i = 0; i < f.length; i++) { array itarat using loop only 
		//		System.out.print(f[i]);  o/p : 10.223.323.0
		//	}
		
	
	}
}
