import java.util.Scanner;
public class Demo {
	public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the 2 numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int res = 0;
	if(a>b) {
		res = b-a;
		System.out.println(" The difference between the numbers is:" + res);
	}
	else {
		 res = a-b;
		 System.out.println(" The difference between the numbers is:" + res);
	
	}
}
}