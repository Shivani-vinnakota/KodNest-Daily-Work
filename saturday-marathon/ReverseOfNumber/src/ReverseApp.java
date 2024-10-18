import java.util.Scanner;

public class ReverseApp {

	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scan.nextInt();
		Demo d = new Demo();
		int res = d.reverseOfNumber(n);
		System.out.println("reverse of a number is:"+res);
	}
}
