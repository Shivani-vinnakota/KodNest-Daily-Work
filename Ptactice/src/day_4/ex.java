package day_4;

import java.util.Scanner;

public class ex {
	 
	static int reverse(int n) {
		int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
       return rev;
        }
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to reverse it");
        int n = scan.nextInt();
       
        int res=reverse(n);
        System.out.println("Reversed number is: " + res);

        if (n == res) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
