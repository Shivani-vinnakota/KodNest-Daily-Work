package day_4;
import java.util.Scanner;
public class ArmStrongNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a no");
	int n = scan.nextInt();
	int on = n;
	int num =0;
	while(n!=0) {
		int rem = n %10;
		 num = num+rem *rem*rem;
		 n = n/10;
	}
	System.out.println(num);
	if (on == num) {
		System.out.println("It is armstrong number");
	}
	else {
		System.out.println("it is not armstrong number");
	}
}
}
