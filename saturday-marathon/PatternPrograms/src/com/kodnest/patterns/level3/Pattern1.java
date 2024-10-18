package com.kodnest.patterns.level3;

public class Pattern1 {
public static void main(String[]args) {
	//start from 1 line go until 2nd Line
	for(int i =1;i<=2;i++) {
		
	//in every line start from 1st star go until line number of stars
		for(int j = 1; j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
