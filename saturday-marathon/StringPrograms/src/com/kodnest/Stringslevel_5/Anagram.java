package com.kodnest.Stringslevel_5;
import java.util.Arrays;
public class Anagram {
	boolean isAnagram(String str1,String str2)
	{
	char[] arr1 = str1.toLowerCase().toCharArray();
	char[] arr2 = str2.toLowerCase().toCharArray();
	   Arrays.sort(arr1);
	   Arrays.sort(arr2);
	   for(int i=0;i<=arr1.length-1;i++)
	  {
	    if(arr1[i]!=arr2[i])
	     {
	         return false;
	      }
	   else
	      {
	       continue;
	      }
	   }
     return true;
	}
}
