package Strings;
import java.util.Scanner;
public class ex2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	String str2 = scan.nextLine();
	if((str.length())==(str2.length())) {
		System.out.println("same");
	}else 
		System.out.println("different");
	
  }
}
