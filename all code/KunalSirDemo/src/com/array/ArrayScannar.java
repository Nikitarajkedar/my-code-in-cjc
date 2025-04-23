package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScannar {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("how many element you want to add");
	int num=scanner.nextInt();
	String s[]=new String[num];
	System.out.println("enter element");
	

	for (int i = 0; i < s.length; i++) {
		
		s[i]=scanner.next()+scanner.nextLine();
		
	}
	System.out.println(Arrays.toString(s));
	for (String string : s) {
		System.out.println(string);
	}
	
	}

@Override
public String toString() {
	return "ArrayScannar []";
}
ArrayScannar arrayScannar=new ArrayScannar();
}
