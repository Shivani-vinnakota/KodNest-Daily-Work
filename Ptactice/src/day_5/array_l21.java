package day_5;
import java.util.Scanner;

public class array_l21 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	int n = scan.nextInt();
	int arr[]= new int[n];
	for(int i = 0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.print("Before Swapping : ");
	for(int i =0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Enter the 2 indexes where you want to swap");
	int n1 = scan.nextInt();
	int n2 = scan.nextInt();
	int help;
	help = arr[n1];
	arr[n1]=arr[n2];
	arr[n2]=help;
	System.out.println("After Swapping:");
	for(int x :arr) {
		System.out.println(x+" ");
	}
	
	
	
}
}
