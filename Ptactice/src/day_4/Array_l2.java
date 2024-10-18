package day_4;
import java.util.Scanner;
public class Array_l2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size");
	int n = scan.nextInt();
	int arr[]= new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	for(int i:arr) {
		if(i>=0) {
			System.out.print(i+" ");
		}
	}
}
}
