package day_5;
import java.util.Scanner;
public class CopyArray {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n = scan.nextInt();
	int arr1[] = new int[n];
	for(int i =0;i<=arr1.length-1;i++) 
	{
		arr1[i]=scan.nextInt();
	}
	System.out.println("first array elements");
	for(int i:arr1) {
		System.out.print(i+" ");
	}
	System.out.println();
	int arr2[]= new int[arr1.length];
	
	for(int i =0;i<=arr1.length-1;i++) 
	{
		arr2[i]=arr1[i];
	}
	System.out.println("2nd array elements");
	for(int i:arr2) {
		System.out.print(i+" ");
	}
}
}
