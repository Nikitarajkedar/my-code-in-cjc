package com.opps.polymorphism;

public class MainStudent {
	public static void main(String[] args) {
		
	
//	        2.compilation rule==== create a class Student and build method as 
//			study and one derived class as graduate and one method as doproject 
//			and in main method make object as reference as student and object as
//			graduate and call the method     

		Student st=new Graduate();
		st.study();
		
		Graduate gd=new Graduate();
		gd.doProject();
		gd.study();
}
}