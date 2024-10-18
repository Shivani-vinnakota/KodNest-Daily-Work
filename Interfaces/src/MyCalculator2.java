import java.util.Scanner;

public class MyCalculator2 implements Calculator {
	Scanner scan = new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a==0 || b==0) {
			System.out.println("IDIOT FOR THIS YOU NEED CALCULATOR...?");
		}
		int c = a+b;
		System.out.println(c);
	}

	@Override
	public void subtraction() {
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a==0 || b==0) {
			System.out.println("IDIOT FOR THIS YOU NEED CALCULATOR....?");
		}
		int c = a-b;
		System.out.println(c);
	}

	@Override
	public void multi() {
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a==0 || b==0) {
			System.out.println("IDIOT FOR THIS YOU NEED CALCULATOR....?");
		}
		int c = a*b;
		System.out.println(c);
	}

	@Override
	public int div() {
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c=0;
		if(b==0) {
			System.out.println("IDIOT HO TAUGHT YOU MATH...YOU CANNOT DIVIDE A NUMBER BY ZERO");
		}
		else {
		 c = a/b;
		}
		return c;
	}

}
