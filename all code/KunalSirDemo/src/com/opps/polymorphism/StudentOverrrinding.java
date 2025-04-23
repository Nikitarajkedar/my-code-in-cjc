package com.opps.polymorphism;

public class StudentOverrrinding {
   //Overrriding :-
	//same method name ,same parameter but child class 
	// it happen in only parrent and chid relation (inheritnace)
	//ex- toString() this is object class method we can override in our any class becouse object is parrent of each class 
	//when child class method is  not satisfy the parrent class method  implimetion then child class write there own implimention 
	
	 int rollNo;
	String name;
	public StudentOverrrinding(int rollNo,String name) {
	this.rollNo=rollNo;	
	this.name= name;
	}
public int getRollNo() {
	return rollNo;
}
public String getName() {
	return name;
}

@Override
public String toString() {
	return "Student Name : "+name+"\nStudent RollNumber : "+rollNo;
	}

public static void main(String[] args) {
	StudentOverrrinding so=new StudentOverrrinding(102, "ram");
	System.out.println(so);              // when we not override the toString Method : o/p :com.polymorphism.StudentOverrrinding@378fd1ac -becouse  object print address,
										// when we  override the toString Method :o/p : Student Name : ram
										//											    Student RollNumber : 102

	StudentOverrrinding so1=new StudentOverrrinding(103, "nikita");
	System.out.println(so1); 
	StudentOverrrinding so2=new StudentOverrrinding(104, "santosh");
	System.out.println(so2); 
	StudentOverrrinding so3=new StudentOverrrinding(105, "mahi");
	System.out.println(so3); 
	StudentOverrrinding so4=new StudentOverrrinding(106, "mihir");
	System.out.println(so4); 
}
}
