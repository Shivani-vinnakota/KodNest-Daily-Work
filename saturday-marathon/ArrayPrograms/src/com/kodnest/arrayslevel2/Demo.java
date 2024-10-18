package com.kodnest.arrayslevel2;
import java.util.Scanner;

public class Demo {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the two numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();	
	System.out.println("Before Swapping"+ a+" "+b);
	int help ;
	help = a;
	a = b;
	b = help;
	System.out.println("After Swapping"+ a+" "+b);
}
}
