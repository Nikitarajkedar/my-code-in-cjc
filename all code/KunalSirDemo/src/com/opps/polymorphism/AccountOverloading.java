package com.opps.polymorphism;

public class AccountOverloading {
void display(int accNo) {
	System.out.println("Account Number        :"+ accNo);
}
 void display(int accNo, String accHoName) {
	 System.out.println("Account Number        :"+ accNo);
	 System.out.println("Account Holder Name   :" +accHoName);

 }	
 void display(int accNo,String email,double balance) {
	 System.out.println("Account Holder number :"+accNo);
	 System.out.println("Account Holder Email  :"+email);
	 System.out.println("Account Balance       :"+balance); 
 }
public static void main(String[] args) {
	AccountOverloading account=new AccountOverloading();
	account.display(123);
	System.out.println();
	account.display(123,"Nikita Kedar"+"\n");
	account.display(123,"nikitakedar@gmail.com", 1000232.87d);
}
}
