package com.kodnest.training.twodarray;

import java.util.Scanner;

public class Student {
	public static void mani(String[]args) {
		Scanner scan = new Scanner(System.in);
		int [][]arr = new int[2][5];
		for(int i = 0; i<= arr.length-1;i++) {
			for(int j =0;j<= arr[i].length-1;i++)
		{
			System.out.println("Enter the marks of class"+i+"student"+j);
			arr[i][j]= scan.nextInt();
		}
		
	}
		for(int i = 0; i<= arr.length-1;i++) {
			for(int j =0;j<= arr[i].length-1;i++)
		{
				System.out.println(arr[i][j]+ " ");
		}
			System.out.println();
		}
		
       scan.close();
}
}

