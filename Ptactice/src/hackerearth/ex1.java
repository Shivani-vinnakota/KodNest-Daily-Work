package hackerearth;

import java.util.Scanner;

public class ex1 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the array1 size");
			int arr1[]= new int[scan.nextInt()];
			
			System.out.println("Enter the array1 size");
			int arr2[]= new int[scan.nextInt()];
			
			System.out.println("Enter the array1 size");
			int arr3[]= new int[scan.nextInt()];
			
			for(int i=0;i<=arr1.length-1;i++) {
				arr1[i]=scan.nextInt();
			}
			for(int i=0;i<=arr2.length-1;i++) {
				arr2[i]=scan.nextInt();
			}
			for(int i=0;i<=arr3.length-1;i++) {
				arr3[i]=scan.nextInt();
			}
			for(int i:arr1) {
				System.out.print(i+" ");
			}
			System.out.println();
			for(int i:arr2) {
				System.out.print(i+" ");
			}
			System.out.println();
			for(int i:arr3) {
				System.out.print(i+" ");
			}
			int res[]=new int[arr1.length];
			for(int i=0;i<=res.length-1;i++) {
				if(arr1[i]==arr2[i]) {
					if(arr2[i]==arr3[i]) {
					res[i]=arr1[i];
					}
				}
			}
			for(int i:res) {
				System.out.print(i+" ");
			}
}
}
