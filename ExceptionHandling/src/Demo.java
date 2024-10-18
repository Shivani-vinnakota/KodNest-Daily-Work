import java.util.Scanner;
public class Demo {
public static void main(String[] args)
{ 
	try {
	System.out.println("Connection Established");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 numbers for division");
	int a = scan.nextInt();
	int b= scan.nextInt();
	int c = a/b;
	System.out.println("Division result is "+c);
	System.out.println("Connection terminated");
   }
	catch(Exception e) {
		System.out.println(e);
	}
  }
  }