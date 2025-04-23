package com.opps.polymorphism;

public class NatureOverloading {
	
	//Polymorphisem - one name many form ,purpose of polymorphisem  is make redability and understanding easy
	// ex- student -st1 st2 st3(nikita ,rohini,sakshi)etc. one of student many student
	
	// Overloading - same method name but different parameter in same class
	
	String fname;
	public void flower() {
		System.out.println(fname);
	}
	public void flower(String fname) {
		System.out.println("name of flower :"+fname);	

	}
	public void flower(String fname1,String fname2) {
		System.out.println("name of flower :"+fname1+"\n"+fname2);


	}
	public void flower(String fname,int fprice) {
		System.out.println(fname +":"+fprice);
	}
	public static void main(String[] args) {
		NatureOverloading n=new NatureOverloading();
		n.fname="Roj";
		n.flower();
		n.flower("Acacia");
		n.flower("Lotus", 20);
		n.flower("chameli", "champa");

	}

}
