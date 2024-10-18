package Strings;

import java.util.Scanner;

public class ex5 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	String str = scan.nextLine();
          int ucount = 0;
          int lcount = 0;
   for(int i = 0 ; i<= str.length()-1;i++) {       
	if(Character.isLowerCase(str.charAt(i))) {
		lcount++;
	 }
	else  ucount++;
}
   System.out.println(ucount);
   System.out.println(lcount);
}
}
