package com.shivani.loops;
import java.util.Scanner;

public class SimpleIf {
	public static void main(String[]args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter your SSC percentage");
		int marks = scan.nextInt();
		if(marks > 60) {
			System.out.println("You are eligible for 1st Level");
			
			System.out.println("Enter your Inter / Diploma Percentage");
			int marks2 = scan.nextInt();
			if(marks2 > 65) {
				System.out.println("You are Eligible for 2nd level");
				
				System.out.println("Enter your B.Tech percentage");
				int marks3 = scan.nextInt();
				if(marks3 > 70) {
				System.out.println("You are Eligible for this Training");	
				}
			}
		}
		scan.close();
		
		
	}
}
