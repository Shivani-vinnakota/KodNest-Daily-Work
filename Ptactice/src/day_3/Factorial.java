package day_3;
import java.util.Scanner;
public class Factorial 
{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a no:");
	int n = scan.nextInt();
	int fact =1;
	for(int i=1;i<=n;i++) {
		fact = fact *i;
	}
	System.out.println(fact);
}
}
