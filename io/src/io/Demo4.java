package io;

import java.util.Scanner;

public class Demo4 {
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your World");
	String name = scan.next();
	System.out.println("My World is "+name);
	System.err.println("Exception...");
	}
}
