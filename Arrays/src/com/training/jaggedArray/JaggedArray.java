package com.training.jaggedArray;
import java.util.Scanner;
public class JaggedArray {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1D length");
		String arr[][]=new String[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.println("Enter 2nd D length for 1st D "+i);
		arr[i]=new String[scan.nextInt()];
		}
		
		scan.nextLine();
		for(int i =0; i<= arr.length-1;i++) {
			
			 for(int j = 0; j<= arr[i].length-1; j++) {
				 System.out.println("Enter the Name of Bank "+ i+"customer"+j);
				 arr[i][j] =scan.nextLine();
			 }
		}
		for(int i =0; i<= arr.length-1;i++) {
			
			 for(int j = 0; j<= arr[i].length-1; j++) {
				 System.out.print(arr[i][j]+" ");
			 }
		System.out.println();
	}
 scan.close();
}
}
