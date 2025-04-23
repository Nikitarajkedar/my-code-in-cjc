package com.opps.inheritance;

public class ConstructorSuperA {
	public ConstructorSuperA(){
		System.out.println("parrentclass constructer");
	}
	public ConstructorSuperA(int a) {
		System.out.println("parrentclass parameterice constructer :"+a);
		this.display();
	}

	void display() {
		System.out.println("A-display method");
	}
	

}


