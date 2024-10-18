import java.util.Scanner;

public class Main {
	public static void checkMultipleOfTen(int n)
	{
	// your code here
		if(n%10==0) {
			System.out.println("Entered Number "+n+" Is Multiple of 10");
		}
		else {
			System.out.println("Entered Number "+n+" Is Not Multiple of 10");
		
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		checkMultipleOfTen(n);
		scan.close();
	}
}
