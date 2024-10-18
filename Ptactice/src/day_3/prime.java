package day_3;
import java.util.Scanner;
public class prime {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a no");
	int n = scan.nextInt();
	
	/*for(int i = 2; i<n;i++) {
		if(n%i==0) {
			System.out.println("It is not prime");
			return;
		}			
	}
	System.out.println(n+" it is prime");*/
	if(n<2) {
		System.out.println("it is not prime");
	}
	else {
	boolean isPrime = true;
	for(int i=2; i*i<n;i++) {
		if(n%i==0) {
			isPrime=false;
			break;
		}
	}
	
	
	if(isPrime==true) {
		System.out.println("it is prime");
	}
	else {
		System.out.println("It is not prime");
	}
	}
} 
}
