package day_3;
import java.util.Scanner;
public class Gradech {
	public class Main
	{
	public static void checkGrade(int grade)
	{ // your code here
		if(grade > 50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the grade");
		int marks = scan.nextInt();
		checkGrade(marks);
		}
	}
}
