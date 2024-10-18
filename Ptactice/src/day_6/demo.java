package day_6;
import java.util.Scanner;
public class demo {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1st array size");
	int arr1[]=new int[scan.nextInt()];
	for(int i=0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
	}
	System.out.println("Enter 2nd array size");
	int arr2[]=new int[scan.nextInt()];
	for(int i=0;i<=arr1.length-1;i++) {
		arr2[i]=scan.nextInt();
	}
	
	int arr3[]=new int[arr1.length+arr2.length];
	int index=0;
	for(int i=0;i<=arr1.length-1;i++) {
		arr3[index++]=arr1[i];
	}
	for(int i=0;i<=arr2.length-1;i++) {
		arr3[index++]=arr2[i];
	}
	for(int i:arr3) {
		System.out.print(i+" ");
	}
}
}
