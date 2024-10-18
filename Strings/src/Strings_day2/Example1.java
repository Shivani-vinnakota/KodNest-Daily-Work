package Strings_day2;

public class Example1 {
public static void main(String[]args) {
	String s1 = "RAMA";
	String s2 = "RAMA";
	
	if(s1==s2) {
		System.out.println("References Are Equal");
	}
	else {
		System.out.println("References Are Unequal");
	}
	if(s1.equals(s2)) {
		System.out.println("Strings Are Equal");
	}
	else
		System.out.println("Strings Are Unequal");
}
}
