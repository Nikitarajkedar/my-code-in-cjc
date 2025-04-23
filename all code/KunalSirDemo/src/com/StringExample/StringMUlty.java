package com.StringExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.Buffer;
class MulString{

	
	     public static String string_multiply(String A, String B) {
		 if(A== null || A.isEmpty() || B==null || B.isEmpty())
		{
		 return "0";

		 }
		 BigInteger str1= new BigInteger(A);
		 BigInteger str2= new BigInteger(B);
		 BigInteger result= str1.multiply(str2);
		 return result.toString();
		 }
}
	     public class StringMUlty {
	     public static void main(String[] args) throws IOException {
	    	 MulString mulString=new MulString();
	    	 BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	    	 String s1=b.readLine();
	    	 String s2=b.readLine();
	    	 String result=mulString.string_multiply(s1,s2);
	    	 System.out.println(result);
	    	 
		}
}
