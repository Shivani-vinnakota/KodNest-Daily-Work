package Strings_day2;

public class Example4 {
public static void main(String[]args) {
		String s1 =  "Rama";
		String s2 =  "Sita";
		String s3 = "Rama" +"Sita";
		String s4 = "Rama"+"Sita";
		
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

