package com.logical;

import java.util.Scanner;

public class Gradefor10student {
public static void main(String[] args) {
	
int marathi,hindi,english,science,socialscience,math,total,per;
Scanner scanner=new  Scanner(System.in);
 System.out.println("enter marathi mark");
 marathi=scanner.nextInt();
 System.out.println("enter hindi mark");
 hindi=scanner.nextInt();
 System.out.println("enter English mark");
 english=scanner.nextInt();
 System.out.println("enter science mark");
 science=scanner.nextInt();
 System.out.println("enter socialscience mark");
 socialscience=scanner.nextInt();
 System.out.println("enter math mark");
 math=scanner.nextInt();
 
 total=marathi+hindi+english+science+socialscience+math;
 per=total/6;

 
 if(per>=75) {
	 System.out.println("frist class with Distiction"+per);
 }
 else if(per>=60) {System.out.println("frist class"+per);}




}}