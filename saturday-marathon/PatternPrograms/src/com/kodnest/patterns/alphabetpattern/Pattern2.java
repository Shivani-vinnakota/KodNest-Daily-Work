package com.kodnest.patterns.alphabetpattern;

public class Pattern2 {
	public static void main(String[]args) {
		
		for(int i = 1;i<=5;i++) {
			//am re-intializing with 'A' every time
			char ch = 'A';
			for(int j = 1; j<=i;j++) {;
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			
		}
	} 
}
