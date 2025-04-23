package com.logical;

import java.util.Scanner;
						
public class VovalFound {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter the charactor ");
	char c=s.next().charAt(0);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='u')
{
		System.out.println(c +" is a vovel");
	}
	else {
		System.out.println(c+" is not vovel");
	}
	s.close();
	}
}
