package com.kodnest.Stringslevel_3;

import java.util.Scanner;

import com.kodnest.Stringslevel_2.Reverse;

public class Main 
{
       public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		System.out.println("Original String Is "+str);
		ReverseWord reverse = new ReverseWord();
		String reverseStringWord = reverse.reverseStringWord(str);
		System.out.println("Reversed Words String "+reverseStringWord);

      }

}
