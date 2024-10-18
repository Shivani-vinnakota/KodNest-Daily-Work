package day_3;
import java.util.Scanner;
public class MulTn {
	public  void checkMultipleOfTen(int n) {
		 if(n%10==0) {
			 System.out.println("The number is a multiple of 10");
		 }
		 else {
			 System.out.println("The number is not multiple of 10");
		 }
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number");
	int n = scan.nextInt();
	MulTn m = new MulTn();
	m.checkMultipleOfTen(n);
}
}
