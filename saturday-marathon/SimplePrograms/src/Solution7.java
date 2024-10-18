import java.util.Scanner;

public class Solution7 {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = scan.nextInt();
	printEvenDisplayBy3(n);
}
public static void printEvenDisplayBy3(int n) {
	for(int i = 1; i<n;i++) {
		
		if(i%2 == 0 && i%3 == 0) {
			System.out.println(i);
		}
	}
}
}
