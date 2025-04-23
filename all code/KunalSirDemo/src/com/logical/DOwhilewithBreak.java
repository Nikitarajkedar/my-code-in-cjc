package com.logical;

public class DOwhilewithBreak {
	public static void main(String[] args) {
		int num=10;
		int i=1;
		do{
			System.out.println(i*num);
			if(i==5) 
				break;

			i++;
		}while(i<10);


	}
}
