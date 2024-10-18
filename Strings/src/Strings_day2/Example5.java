package Strings_day2;

public class Example5 {
public static void main(String[]args) {
		String s1 =  "Rama";
		String s2 =  "Sita";
		String s3 = s1+s2;
		String s4 = s1+s2;
		
		if(s3==s4) {
			System.out.println("References Are Equal");
		}
		else {
			System.out.println("References Are Unequal");
		}
		if(s3.equals(s4)) {
			System.out.println("Strings Are Equal");
		}
		else
			System.out.println("Strings Are Unequal");
		
}
}
