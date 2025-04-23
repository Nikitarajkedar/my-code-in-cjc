package com.StringExample;

import java.util.Arrays;

public class Split {
public static void main(String[] args) {
	String str="my name is nikita ";
	
	String a[]=str.split(" ");
	System.out.println(Arrays.toString(a));
	int countofword =0,countofchar=0;
	
	for (int i = 0; i < a.length; i++) {
	
		char [] c=a[i].toCharArray();
		
		for (int j = 0; j < c.length; j++) {
		System.out.println(c[j]);	
		countofchar++;
		
		}
		System.out.println(a[i]+":"+countofchar);
		countofword++;
	}
	System.out.println("word in string :"+countofword);
	System.out.println("char in string :"+countofchar);

	String data = "apple,banana,grape";
	String[] fruits = data.split(","); // with help of , we can split the all string 
	System.out.println(Arrays.toString(fruits));
	// fruits = ["apple", "banana", "grape"]
	
	String d="C:\\Users\\santo\\OneDrive\\Desktop\\cjc.pdf"	;
	String[] folder=d.split("\\\\"); //only \\ is not allowed so that we can used \\\\ double backslash  because \n is next line \t is tab so that not allow
	String  filename=folder[folder.length-1]; // hear we can tuck folder length is 4 and we array count start from 0 so that last length is length - 1
	System.out.println(filename);
	
	//System.out.print("[ ");
//	for (int i = 0; i < a.length; i++) {
//		System.out.print(a[i]+" ");
//		
//	}
//	System.out.print("]");
}
}
