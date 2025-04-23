package com.logical;

import java.util.Scanner;

public class VotingCardApplication {
	
	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		 System.out.println("are you indian");
		 boolean isaindian=scanner.nextBoolean();
		if(isaindian==true){
			 System.out.println("enter your age");
			 int age=scanner.nextInt();
			if(age>=18){
				System.out.println("congratulations.....you are eligibale for voting card");
				
			}else{
				System.out.println("not eligibale.....Age is less than 18");

			
		}}else {
			System.out.println("your are not eligibal....for voting card.. you dont have  indian natinality");
		}
		
		
		scanner.close();
	}

}
