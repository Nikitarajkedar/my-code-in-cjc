package com.oops.encapsulation;

public class A {
private int x=100; 

// private variable access with the help of another public variable 
public int y=x;


//private variable access in outside class with help of method
public int valueX() {
	return x;
}
public A() {
 y=x;
}
//private variable accesss in another class with help of toString method with the help of  printing  A class object
@Override
public String toString() {
	return "x=" + x ;
}

}
