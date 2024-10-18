import java.util.Scanner;
public class Calculator {
Scanner scan = new Scanner(System.in);
   void addition() {
	   System.out.println("Enter 2 numbers for addition");
	   int a = scan.nextInt();
	   int b = scan.nextInt();
	   System.out.println("Addition of"+a+"and"+b+"is" + (a+b));
   }
   void subtraction() {
	   System.out.println("Enter 2 numbers for subtraction");
	   int a = scan.nextInt();
	   int b = scan.nextInt();
	   System.out.println("Subtraction of"+a+"and"+b+"is" + (a-b));
   }
   void multiplication() {
	   System.out.println("Enter 2 numbers for multiplication");
	   int a = scan.nextInt();
	   int b = scan.nextInt();
	   System.out.println("Multiplication of"+a+"and"+b+"is" + (a*b));
   }
   void division() {
	   System.out.println("Enter 2 numbers for division");
	   int a = scan.nextInt();
	   int b = scan.nextInt();
	   System.out.println(" Division of"+a+"and"+b+"is" + (a/b));
   }
   void findRemainder() {
	   System.out.println("Enter 2 numbers for finding Reaminder");
	   int a = scan.nextInt();
	   int b = scan.nextInt();
	   System.out.println("remainder when"+a+"is divided by"+b+"is" + (a%b));
   }
   void findSquare() {
	   System.out.println("Enter a number for finding square");
	   int a = scan.nextInt();
	   System.out.println("Square  of a number"+a+"is" + (a*a));
   }
   
}
