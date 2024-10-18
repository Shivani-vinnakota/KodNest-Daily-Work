import java.util.Scanner;

public class Demo {
 public static void main(String[]args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n = scan.nextInt();
	 System.out.println("Enter the multiple of the number");
	 int m = scan.nextInt();
	 checkMultipleOfNumber(n,m);
 }
 public static void checkMultipleOfNumber(int n,int m)
	{
	// your code here
		if(n%m==0) {
			System.out.println("Entered Number "+n+" Is Multiple of "+m);
		}
		else {
			System.out.println("Entered Number "+n+" Is Not Multiple of "+m);
		
		}
	}
}