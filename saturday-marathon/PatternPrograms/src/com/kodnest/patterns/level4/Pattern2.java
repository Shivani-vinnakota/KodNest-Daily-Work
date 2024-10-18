package com.kodnest.patterns.level4;

public class Pattern2 {
	public static void main(String[]args) {
		
		//no.of lines
		for(int i =1;i<=5;i++) {
			//no of'#'s
			for(int j=1;j<=5;j++) {
				System.out.print("#");
			}
			//no of '*'s
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
