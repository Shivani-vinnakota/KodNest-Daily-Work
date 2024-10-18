package com.kodnest.patterns.level3;

public class Pattern6 {
	public static void main(String[]args) {
		//start from 1 line go until 5th Line
		for(int i =1;i<=5;i++)
		{
			for(int j = 1; j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
