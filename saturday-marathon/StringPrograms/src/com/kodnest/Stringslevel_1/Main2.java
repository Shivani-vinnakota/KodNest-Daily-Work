package com.kodnest.Stringslevel_1;
import java.util.Scanner;

public class Main2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 Strings");
	String s1 = scan.nextLine();
	String s2 = scan.nextLine();
	
	Concatination concate = new Concatination();
	String res = concate.theConcatination(s1,s2);
	
	if(res!=null)
	{
		System.out.println("Concatinated String is : " +res);
	}
	else
	{
		System.out.println("Strings Are Not Same To Concate ");
	}
	
}
}
