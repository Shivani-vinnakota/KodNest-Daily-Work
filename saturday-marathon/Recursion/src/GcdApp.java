import java.util.Scanner;

public class GcdApp 
{
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	int m = scan.nextInt();
	int n = scan.nextInt();
	Gcd gcd = new Gcd();
	int res = gcd.gcd(m, n);
	System.out.println(res);
}
}
