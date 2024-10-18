package Strings;

import java.util.Scanner;

public class ex4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();

	for(int i = 0 ; i<=str.length()-1;i++) {
		int unicode = (int)str.charAt(i);
		 System.out.println(unicode);
	}
	
	
}
}
