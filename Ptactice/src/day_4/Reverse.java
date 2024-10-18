package day_4;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a no to reverse it");
	int n = scan.nextInt();
	
	ReverseApp rv = new ReverseApp();
	int rev = rv.reverse(n);
	System.out.println("reversed no is:"+rev);
	if(n==rev) {
		System.out.println("It is palindrome");
	}
	else {
		System.out.println("It is not palindrome");
	}
}
}
