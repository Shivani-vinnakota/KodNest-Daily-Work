import java.util.Scanner;

public class Main {
	public static void categorizeAge(int age) { 
		if(age>=0 & age<=12) {
			System.out.println("CHILD");
		}
		else if(age>=13 & age<=19) {
			System.out.println("TEEN");
		}
		else if(age>=20 & age<=59) {
			System.out.println("ADULT");
		}
		else if(age>=60 ) {
			System.out.println("SENIOR");
		}
		else {
			System.out.println("Invalid Number");
		}
		} 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scan.nextInt();
		categorizeAge(age);
		}
}
