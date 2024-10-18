package day_6;
import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	int arr[]= new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	for(int x:arr) {
		System.out.print(x+" ");
	}
	System.out.println("Enter the key");
	int key = scan.nextInt();
  BubbleApp ba = new BubbleApp();
  int index=ba.sort(key, arr);
  if(index != -1) {
	  System.out.println("key found at index : "+index);
  }
  else {
	  System.out.println("Key is not foud");
  }
}
}
