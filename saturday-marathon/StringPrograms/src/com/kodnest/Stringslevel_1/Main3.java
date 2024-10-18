package com.kodnest.Stringslevel_1;
import java.util.Scanner;

public class Main3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String");
	String s1 = scan.nextLine();
	ConvertCharacters thecharacters = new ConvertCharacters();
	thecharacters.printUnicode(s1);
	System.out.println();
}
}
