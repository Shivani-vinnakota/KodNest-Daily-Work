package com.kodnest.Stringslevel_5;
import java.util.Scanner;
public class Main5 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
	 if(str1.length()==str2.length())
	  {
		Anagram theAnagram=new Anagram();
		boolean res=theAnagram.isAnagram(str1, str2);
		if(res==true)
		{
		  System.out.println("Entered Strings Are Anagrams");
		}
		else
		{
		  System.out.println("Entered Strings Are Not Anagrams");
		}
	  }
		else
		{
		 System.out.println("Strings Are Not Anagrams");
		}
	}
}

