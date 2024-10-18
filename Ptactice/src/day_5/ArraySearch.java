package day_5;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args)
	{
	//Complete code here
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]= new int[scan.nextInt()];
		for(int i =0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to search:");
		int key = scan.nextInt();
		Search s = new Search();
		int v =s.isPresent(arr,key);
		if(v>=0) {
			System.out.println(key+"key is present at the index"+v);
		}
		else {
			System.out.println(key+"key is NOT present in an array");
		}
	}
}
