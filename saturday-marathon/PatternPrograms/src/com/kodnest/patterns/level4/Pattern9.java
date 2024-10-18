package com.kodnest.patterns.level4;

public class Pattern9 {
public static void main(String[]args) {
		
		//no.of lines
		for(int i =1;i<=5;i++) {
			//no of spaces
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
		}
			//no of '*'s
			for(int k=1;k<=5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	 

            //no.of lines
         for(int i =1;i<=5;i++) {
	       //no of spaces
	     for(int j=1;j<=i;j++) {
		     System.out.print(" ");
            }
	            //no of '*'s
	              for(int k=1;k<=5;k++) {
		           System.out.print("*");
	        }
	        System.out.println();
         }
     }  
}
