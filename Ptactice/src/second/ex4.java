package second;
import java.util.Scanner;
public class ex4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1st dimensional length");
	int n = scan.nextInt();
	String arr[][] = new String[n][];
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println("Enter the 2nd dimensional length "+i);
		int m = scan.nextInt();
		arr[i] = new String[m];
	}
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
		System.out.println("Enter bank of employees "+i+"name "+j);
		arr[i][j]=scan.next();
	    }
	}
	
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
		System.out.print(arr[i][j]+" ");
	    }
		System.out.println();
	}
}
}
