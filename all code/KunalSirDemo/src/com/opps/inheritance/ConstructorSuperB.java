package com.opps.inheritance;

public class ConstructorSuperB extends ConstructorSuperA {
	public ConstructorSuperB(){
		//by defoult constructer is present

		super();//at a time single super key word write for calling parent constructer call


		System.out.println("CHILDclass  defoult constructer");
	}

	public ConstructorSuperB( int a){
		super(a);
		System.out.println("CHILDclass  parametrise constructer :"+a);
	}
	void display() {
		super.display();
		System.out.println("B-display method");
	}

}
