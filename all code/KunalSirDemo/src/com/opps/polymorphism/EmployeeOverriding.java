package com.opps.polymorphism;

public class EmployeeOverriding {
	private int empid;
	private String empname; 

	public EmployeeOverriding(int empid ,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	@Override
	public String toString() {
		return "EmployeeOverriding [empid=" + empid + ", empname=" + empname + ", getEmpid()=" + getEmpid()
				+ ", getEmpname()=" + getEmpname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
public static void main(String[] args) {
	EmployeeOverriding employeeOverriding =new EmployeeOverriding(12233,"snkldckkd");
	System.out.println(employeeOverriding.toString());
	
}
}
