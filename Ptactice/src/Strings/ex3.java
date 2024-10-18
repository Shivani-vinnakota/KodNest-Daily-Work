package Strings;
import java.util.Scanner;
public class ex3 {
public static void main(String[] args) {
	Scanner scan  = new Scanner(System.in);
	String str = scan.nextLine();
	String str2 = scan.nextLine();
	if(str.equals(str2)) {
	str =	str.concat(str2);
	}
	else return;
	System.out.println(str);
	
}
}
