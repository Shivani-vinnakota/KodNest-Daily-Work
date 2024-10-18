package com.kodnest.arrayslevel5;
import java.util.Scanner;

public class BinarySearchApp {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter array length");
	int arr[]= new int[scan.nextInt()];
	System.out.println("Enter"+arr.length+"Elements to store in array");
    for(int i = 0; i<= arr.length-1;i++) {
    	arr[i] = scan.nextInt();
    }
    System.out.println("Enter Key to search");
    int key = scan.nextInt();
    Search search = new Search();
    int res = search.binarySearch(arr,key);
    
    if(res == -1) {
    	System.out.println("Key Not Found");
    }
    else {
    	System.out.println("Key Found at the index : "+res);
    }
}
}
