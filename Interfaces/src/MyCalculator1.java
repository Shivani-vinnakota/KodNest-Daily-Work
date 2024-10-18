import java.util.Scanner;

public class MyCalculator1 implements Calculator {

	Scanner scan = new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a+b;
		System.out.println(c);
	}

	@Override
	public void subtraction() {
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a-b;
		System.out.println(c);
		
	}

	@Override
	public void multi() {
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a*b;
		System.out.println(c);
	}

	@Override
	public int div() {
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a/b;
		return c;
	}

}
