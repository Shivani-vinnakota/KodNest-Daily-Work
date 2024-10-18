import java.util.Scanner;

public class Solution3 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print numbers divisible by 3");
		int n =  scan.nextInt();
		displayDivisibleBy3(n);
}
	public static void displayDivisibleBy3(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
			System.out.println(i);
			}
			
		}
	}
}

