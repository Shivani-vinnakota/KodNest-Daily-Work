package com.kodnest.patterns.level2;

public class Pattern3 {
	public static void main(String []args) {
		
		//For loop to take care of number of lines
		for(int i =1;i<=2;i++) {
			
		//printing 1,2,3,4,5 in each line
		for(int j=1;j<=5;j++) {
			System.out.print(j);
		}
		//printing cursor to next line
		System.out.println();
		}
	}
}
