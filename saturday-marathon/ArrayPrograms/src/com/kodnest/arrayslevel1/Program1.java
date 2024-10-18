package com.kodnest.arrayslevel1;

import java.util.Scanner;

public class Program1 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length");
		
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter "+ arr.length +" Elements to store in array");
		for(int i =0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Contents are....");
		//Traditional Approach
		//for(int j = 0; j<=arr.length-1;j++) {
		//System.out.print(arr[j]+" ");
		//}
		for(int x :arr) {
			System.out.print(x+" ");
		}
	}
}
