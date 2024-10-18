package com.kodnest.arrayslevel4;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements to store in Array");
		
		for(int i= 0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		ArraySum arraysum = new ArraySum();
		int sum =arraysum.findSum(arr);
		System.out.println(" sum of all elements in the array" +sum);
	}
}
