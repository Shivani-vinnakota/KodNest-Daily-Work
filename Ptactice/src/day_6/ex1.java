package day_6;
import java.util.Scanner;
public class ex1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array size");
	int arr[]= new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	for(int x:arr) {
		
		if(x<0) {
			x=0;
			System.out.print(x+" ");
			continue;
		}
		System.out.print(x+" ");
	}
}
}
