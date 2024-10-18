package com.kodnest.Stringslevel_2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter A String");
	String str = scan.nextLine();
	System.out.println("Original String======>"+str);
	Reverse reverse = new Reverse();
	String str2 = reverse.stringReverse(str);
	System.out.println("Reversed String =======>"+str2);
}
}
