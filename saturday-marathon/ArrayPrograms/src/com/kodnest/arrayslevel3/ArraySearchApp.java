package com.kodnest.arrayslevel3;

import java.util.Scanner;

public class ArraySearchApp {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter "+ arr.length +" Elements to store in array");
		
		for(int i = 0 ; i<= arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the target to search");
		int target = scan.nextInt();
		
		ArraySearch search = new ArraySearch();
		boolean res =search.isPresent(arr, target);
		if(res==true) {
			System.out.println("Target is present in an Array");
		}
		else {
			System.out.println("Target is Not present in an Array");
		}
		
}
}
