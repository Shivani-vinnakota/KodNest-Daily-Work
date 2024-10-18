package com.kodnest.arrayslevel2;

import java.util.Scanner;

public class PrintingArrayApp {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter "+ arr.length +" Elements to store in array");
		
		for(int i = 0 ; i<= arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		PrintArray array = new PrintArray();
		array.printArray(arr);
}
	}
