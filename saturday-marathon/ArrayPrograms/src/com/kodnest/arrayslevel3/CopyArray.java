package com.kodnest.arrayslevel3;
import java.util.Scanner;
public class CopyArray {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array Length");
	
	int arr1[]= new int[scan.nextInt()];
	System.out.println("Enter"+arr1.length+"Elements to store in Array");
	
	for(int i= 0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
	}
	
	//copying of array elements
	
	int arr2[] = new int[arr1.length];
	for(int i=0;i<=arr1.length-1;i++) {
		arr2[i] =arr1[i];
	}
	
	System.out.println("Array1 Contents Are");
	for(int j = 0; j<=arr1.length-1;j++) {
		System.out.print(arr1[j]+" ");
		}
	System.out.println();
	System.out.println("Array2 Contents Are");
	for(int j = 0; j<=arr2.length-1;j++) {
		System.out.print(arr2[j]+" ");
		}
	
	
}
}
