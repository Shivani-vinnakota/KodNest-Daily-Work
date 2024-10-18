package day_6;
import java.util.Scanner;
public class ex2 {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size");
	int arr1[]= new int[scan.nextInt()];
    for(int i=0;i<=arr1.length-1;i++) {
    	arr1[i]=scan.nextInt();
    }
    
    int arr2[]= new int[arr1.length];
    System.out.println("Enter 2nd array elements");
    for(int i=0;i<=arr2.length-1;i++) {
    	arr2[i]=scan.nextInt();
    }
    int arr3[]= new int[arr1.length];
    for(int i =0;i<=arr1.length-1;i++) { 	
    		arr3[i]=arr1[i]+arr2[i];  		
    	}
    
    for(int x:arr3) {
    	System.out.println(x+" ");
    }
}
}
