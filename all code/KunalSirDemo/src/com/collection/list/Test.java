package com.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.opps.inheritance.Student;

public class Test {

	public static void main(String[] args) {
		
		
		List li=new ArrayList();
		boolean flag=li.add(10);
		li.add(20);
		li.add(30);
		
		String str = "gfw";
		int x = Integer.parseInt(str);
		li.add(x);
		
		System.out.println("List "+li);
		
		int a=(int) li.get(0);
		System.out.println(a);
		System.out.println(li.get(2));
		 li.remove(2);
		 System.out.println(li);
		// li.add(li);
		 System.out.println(li);
		 li.add(li.add(li.add(li.add(56))));
		 System.out.println(li);

		 
	}

}
