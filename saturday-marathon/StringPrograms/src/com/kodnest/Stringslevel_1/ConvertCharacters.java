package com.kodnest.Stringslevel_1;

public class ConvertCharacters {
   void printUnicode(String str)
   {
	   for(int i = 0;i<=str.length()-1;i++) 
	   {
		   int unicode = (int)str.charAt(i);
		   System.out.print(unicode +" ");
	   }
   }
}
