package day_5;
import java.util.Scanner;
public class ArrayMerge {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n = scan.nextInt();
	int arr[] = new int[n];
	for(int i =0;i<=arr.length-1;i++) 
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter the size of an array");
	int m = scan.nextInt();
	int arr2[] = new int[m];
	for(int i =0;i<=arr2.length-1;i++) 
	{
		arr2[i]=scan.nextInt();
	}
	
	int arr3[]= new int[n+m];
	int index = 0;
	
		for(int j =0;j<=arr.length-1;j++) {
			arr3[index]=arr[j];
			index++;
		}
			for(int i=0;i<=arr2.length-1;i++) {
				arr3[index]=arr2[i];
				index++;
		} 	
	
		for(int x:arr3) {
			System.out.print(x+" ");
		}
}
}
