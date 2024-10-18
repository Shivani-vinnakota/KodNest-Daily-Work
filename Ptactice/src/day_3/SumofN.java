package day_3;
import java.util.Scanner;
public class SumofN {
	 int sum  ;
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to calculate the sum of n natural numbers");
	int n = scan.nextInt();
	SumofN s = new SumofN();
	
	System.out.println(s.sum);
	for(int i=1;i<=n;i++) {
		s.sum=s.sum+i;
	}
	System.out.println(s.sum);
}
}
