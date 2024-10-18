import java.util.Scanner;

public class Hacker4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n =scan.nextInt();
	scan.close();
	String ans="";
		if(n%2!=0) {		
				ans = "Weird";
	        }
	else {
			if(n>=2 && n<=5) {
				ans = "Not Weird";
			}
			else if(n>=6 && n<=20) {
				ans = "Weird";
			}
			  else {
				ans = "Not Weird";
			   }
	}
	System.out.println(ans);
}
}
