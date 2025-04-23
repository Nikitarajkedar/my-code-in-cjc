package com.logical;

import java.util.Scanner;

public class BloodDonation2 {
	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		System.out.println("enter your age");
		int age=scanner.nextInt();
		if (age>=18) {
			System.out.println("enter your HB");
			int hb=scanner.nextInt();
			if (hb>=13) {
				System.out.println("congratulations.....you are eligibale for blood donation");
			}else {
				System.out.println("not eligibal....Hb is less than 13");

			}
		}

		else {System.out.println("not eligibale.....Age is less than 18");
		}

		scanner.close();

		
	}
}
