package com.kodnest.Stringslevel_1;
import java.util.Scanner;
public class Main1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 Strings");
	String s1 = scan.nextLine();
	String s2 = scan.nextLine();
	
	LengthChecker lengthchecker= new LengthChecker();
	
	boolean res = lengthchecker.checkLength(s1,s2);
	
	if(res==true)
	{
		System.out.println("Strings Are of Same Length");
	}
	else
	{
		System.out.println("Strings Are of Different Length");
	}
}
}
