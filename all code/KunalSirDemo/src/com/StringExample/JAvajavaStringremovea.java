package com.StringExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JAvajavaStringremovea {
	//	public static String stringMethod(String s,char a) {
	//		int fa=s.indexOf('a');
	//		int la=s.lastIndexOf('a');
	//		
	//		StringBuffer result1 = new StringBuffer();
	//		
	//		for(int i=0;i<s.length();i++){
	//			 if(i == fa){
	//			 continue;
	//			 }
	//			 if(i == la){
	//			 continue;
	//			 }
	//			 result1.append(s.charAt(i));
	//			 }
	//			
	//		
	//		return  result1.toString();
	//		
	//	}

	public static void main(String[] args) {
		//System.out.println(stringMethod("javajava",'a'));
//		List list = new ArrayList();
//		list.add(1);
//		Object object = list.get(list.size()); 
//		System.out.println(object);
		// ans-java.lang.IndexOutOfBoundsException
//		boolean b = Stream.of("Alice", "Bob").anyMatch(s -> { System.out.println(s); return s.startsWith("A"); }); 
//		if(b) { System.out.println("Alice"); } 
//		else { System.out.println("Bob"); }
	//ans Alice,Alice
//		StringBuilder result = Stream.of("a", "b") .parallel() .collect
//	(StringBuilder::new, StringBuilder::append,
//			(a, b) -> b.append(a)); System.out.println(result);
		// ans- a
		
		
		int x=2,y=0;
		for (; y <10; ++y) {
			if(y%x==0)
				continue;
			else if(y==8)
				break;
			else
				System.err.print(y+" ");
			
			//ans-1 3 5 7 9 
			
			
		}
	}
}
