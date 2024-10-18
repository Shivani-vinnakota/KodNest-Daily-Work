package Strings_day6;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String");
	String s1 = scan.nextLine();
	System.out.println("String Before Reversing ===>" +s1);
	Palindrome palindrome = new Palindrome();
	boolean result = palindrome.isPalindrome(s1);
	if(result==true) {
		System.out.println("Entered String is Palindrome");
	}
	else {
		System.out.println("Entered String is NOT-Palindrome");
	}
}
}
