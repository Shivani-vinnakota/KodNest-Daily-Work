import java.util.Scanner;

public class ReverseAnArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the arr1 size");
	int arr1[] = new int[scan.nextInt()];
	for(int i=0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
	}
	for(int x:arr1) {
		System.out.print(x+" ");
	}
	System.out.println();
	int arr2[]= new int[arr1.length];
	int j=0;
	for(int i=arr1.length-1;i>=0;i--) {
		arr2[j++]=arr1[i];
	}
	for(int x:arr2) {
		System.out.print(x+" ");
	}
}
}
