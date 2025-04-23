package com.opps.inheritance;

public class ConstructorSuperTest {
public static void main(String[] args) {
ConstructorSuperB b=new  ConstructorSuperB();	
ConstructorSuperB b1=new  ConstructorSuperB(100);	

ConstructorSuperA a=new ConstructorSuperB();
a.display();
}
}
