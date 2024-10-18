package second;
import java.util.Scanner;
public class ex6 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1D length");
	int arr[][][]= new int[scan.nextInt()][][];
	
	System.out.println("enter 2d length for every 1d ");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.println("Enter 2d length for 1d "+i);
		arr[i]= new int[scan.nextInt()][];
	}
	
	System.out.println("enter 3d length for every 1d and 2d");
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
		System.out.println("Enter 3d length for 1d "+i+"2d "+j);
		arr[i][j]= new int[scan.nextInt()];
	}
 }
	
	/*
	arr[0]=new int[3][];
	arr[1]= new int[2][];
	arr[2]= new int[4][];
	
	arr[0][0]= new int[3];
	arr[0][1]= new int[4];
	arr[0][2]= new int[2];
	
	arr[1][0]= new int[4];
	arr[1][1]= new int[3];
	
	arr[2][0]= new int[2];
	arr[2][1]= new int[3];
	arr[2][2]= new int[2];
	arr[2][3]= new int[1];*/
	
	for(int i=0; i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			for(int k=0;k<=arr[i][j].length-1;k++) {
				System.out.println("Enter marks of school "+i+"class "+j+"Student "+k );
				arr[i][j][k]=scan.nextInt();
				
			}
		}
	}
	
	for(int i=0; i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			for(int k=0;k<=arr[i][j].length-1;k++) {
				System.out.print(arr[i][j][k]+" ");
				
			}
			System.out.println();
		}
	}
 }
}
