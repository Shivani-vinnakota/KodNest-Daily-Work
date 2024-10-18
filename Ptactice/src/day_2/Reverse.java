package day_2;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the size");
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("REversed array is:");
	for(int i = arr.length-1; i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
}
}
