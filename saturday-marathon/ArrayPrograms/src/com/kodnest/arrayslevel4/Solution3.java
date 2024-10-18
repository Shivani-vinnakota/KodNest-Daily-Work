package com.kodnest.arrayslevel4;
import java.util.Scanner;
public class Solution3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array-1 Length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr1.length+" number of elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
		arr1[i]=scan.nextInt();
		}
		System.out.println("Enter Array-2 Length");
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr2.length+" number of elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
		arr2[i]=scan.nextInt();
		}
		System.out.print("Array -1===> ");
		for (int x : arr1) {
		System.out.print(x+" ");
		}
		System.out.print("Array -2===> ");
		for (int x : arr2) {
		System.out.print(x+" ");
		}
		System.out.println();
		System.out.print("Sum Array===> ");
		TwoArraySum sum = new TwoArraySum();
		int res[]=sum.findSum(arr1, arr2);
		for (int x : res) {
		System.out.print(x+" ");
		}
		}
		
		}

