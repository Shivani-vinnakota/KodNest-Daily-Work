package com.kodnest.Stringslevel_5;

public class Main1 {
	public static void main(String[] args) {
		String s1="malayalam";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
		if(!s2.contains(String.valueOf(s1.charAt(i))))
		{
		s2=s2+s1.charAt(i);
		}
		}
		System.out.println(s2);
		}
}
