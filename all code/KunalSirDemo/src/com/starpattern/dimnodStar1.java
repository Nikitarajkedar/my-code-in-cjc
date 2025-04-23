package com.starpattern;

public class dimnodStar1 {

	/*

* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 



	 */
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=5;k>=i;k--){
				 System.out.print("* ");
			}
			for(int p=4;p>=i;p--) {
				 System.out.print("* ");	
		
	}
			System.out.println();
	}
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++){
				 System.out.print("* ");
			}
			for(int p=1;p<=i;p++) {
				 System.out.print("* ");	
		}
			System.out.println();
	}
		
	
}
}
