package day_5;
import java.util.Scanner;
public class ArraySum {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n = scan.nextInt();
	int arr[] = new int[n];
	for(int i =0;i<=arr.length-1;i++) 
	{
		arr[i]=scan.nextInt();
	}
	int sum =0;
	for(int i =0;i<=arr.length-1;i++) 
	{
         
         sum = sum+ arr[i];
	}
	System.out.println("Array elements sum is: "+sum);
}
}
