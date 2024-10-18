import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check wheather number is prime or Not");
		int n = scan.nextInt();
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				System.out.println("Number " + n + " is not prime");
				return;//if we use break in this place ..the next line also get executed 
				//bcz break wil make control out of the loop..so last stmt also executted
			}
		}
		System.out.println("Number " + n + " is  prime");
	}
}
