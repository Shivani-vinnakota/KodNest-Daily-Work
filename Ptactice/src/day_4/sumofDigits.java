package day_4;
import java.util.Scanner;
public class sumofDigits {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = scan.nextInt();
	int sum = 0;
	while(n!=0) {
		int rem = n%10;
		sum = sum +rem;
		n = n/10;
	}
	System.out.println("Sum of the digits "+sum);
}
}
 