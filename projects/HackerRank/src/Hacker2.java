import java.util.Scanner;

public class Hacker2 {
public static void main(String[] args) {
	int i=4;
	double d =4.0;
	String s = "KodNest";
	Scanner scan = new Scanner(System.in);
	
	int i2=scan.nextInt();
	double d2 =scan.nextDouble();
	 scan.nextLine(); // Consume the newline character
	String s2 = scan.nextLine();
	
	System.out.println(i+i2);
	System.out.println(d+d2);
	System.out.println(s.concat(s2));
	
	
}

}
