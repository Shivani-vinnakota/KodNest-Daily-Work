package com.kodnest.Stringslevel_1;
import java.util.Scanner;

public class Main4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = scan.nextLine();
	
	ULCount thecount = new ULCount();
	thecount. UpperLowerCount(str);
 }
}
