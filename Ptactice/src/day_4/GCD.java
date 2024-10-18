package day_4;
import java.util.Scanner;
public class GCD {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the 2 numbers");
	int m = scan.nextInt();
	int n = scan.nextInt();
	int res = findGcd(m,n);
	System.out.println("Greatest common divisor is:"+res);
}
	
	static int findGcd(int m,int n) {
	while(n!=0) {
		int rem = m%n;
		m = n;
		n = rem;
	}
	int gcd =m;
	return gcd;
	}
}

