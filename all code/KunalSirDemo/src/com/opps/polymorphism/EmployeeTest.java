package com.opps.polymorphism;

public class EmployeeTest extends EmployeeOverriding {

	public EmployeeTest(int empid, String empname) {
		super(empid, empname);
		
	}
	@Override
	public int getEmpid() {
		int id =10;
		return id;
	}
	@Override
	public String getEmpname() {
		String str="santosh";
		return str;
	}
	public static void main(String[] args) {
		System.out.println("emp");
		EmployeeTest employeeTest  =new EmployeeTest(1232,"nikita");
		System.out.println(employeeTest.getEmpid());
		System.out.println(employeeTest.getEmpname());
		
		EmployeeOverriding employeeOverriding=new EmployeeOverriding(10,"mahi");
		System.out.println(	employeeOverriding.getEmpid());
	System.out.println(employeeOverriding.getEmpname());
		
	}

}
