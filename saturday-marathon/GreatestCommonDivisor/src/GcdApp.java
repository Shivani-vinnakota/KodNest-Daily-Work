import java.util.Scanner;

public class GcdApp {
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the m value");
	int m = scan.nextInt();
	System.out.println("Enter the n value");
	int n = scan.nextInt();
	//Gcd gcd = new Gcd();
	//int res=gcd.findGcd(m,n);
	int res =Gcd.findGcd(m, n);
	System.out.println(res);
}
}
