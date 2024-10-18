package day_5;
import java.util.Scanner;
public class arrays_l2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 integers");
	int a = scan.nextInt();
	int b = scan.nextInt();

	System.out.println("Before Swapping :"+a+" " +b);
	/*
	 * int help = a; a = b; b = help; System.out.println("After Swapping:"+a+" "
	 * +b);
	 * 
	 */
	 a = a+b;//10+20 = 30
	 b = a-b;//30-20=10
	 a = a-b;//30-10=20
	 System.out.println("After Swapping:"+a+" "+b);
			 
}
}
