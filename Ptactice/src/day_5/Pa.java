package day_5;
import java.util.Scanner;
public class Pa {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int arr[]= new int[scan.nextInt()];
	for(int i =0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	PrintArray.printArray(arr);
}
}
