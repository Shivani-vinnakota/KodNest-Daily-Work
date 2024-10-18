import java.util.Scanner;

public class Solution5 {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number which is Divisible by 5 and 2");
	int n =  scan.nextInt();
	displayDivisibleBy5and2(n);
}
public static void displayDivisibleBy5and2(int n) {
	for(int i=1;i<=n;i++) {
		if(i%5==0 && i%2==0) {
		System.out.println(i);
		}
		
	}
}
}

