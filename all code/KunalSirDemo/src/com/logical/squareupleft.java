package com.logical;

public class squareupleft {
	
	/*
	 
 * * * * *  
   * * * *  
     * * *  
       * *  
         *  
	  */
	
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) { // rowss
			for(int j=1;j<i;j++) { //space
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--) { // coulme
				
				System.out.print(" *");

			}
			System.out.println("  ");

		}
	}

}
