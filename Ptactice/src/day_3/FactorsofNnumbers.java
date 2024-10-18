package day_3;
import java.util.Scanner;
public class FactorsofNnumbers {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a no");
	int n = scan.nextInt();
	
System.out.print("factors of a given number: ");
	for(int i =1;i<n;i++) {
		if(n%i==0) {
			System.out.print(i+" ");
		}
	}
}
}
