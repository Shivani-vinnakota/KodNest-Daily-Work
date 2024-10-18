package com.kodnest.arrayslevel3;
import java.util.Scanner;
public class LinearSearchApp {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array Length");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter "+ arr.length +" Elements to store in array");
	
	for(int i = 0 ; i<= arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter the key to search");
	int key = scan.nextInt();
	
	Search search = new Search();
	int res = search.linearSearch(arr, key);
	
	if(res>0) {
		System.out.println("Key Found At The Index "+res);
	}
	else {
		System.out.println("Key Not Found");
	}
}
}
