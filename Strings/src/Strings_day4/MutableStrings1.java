package Strings_day4;

public class MutableStrings1 {
public static void main(String[] args) {
	StringBuffer sb1 = new StringBuffer();
	System.out.println(sb1.capacity());
	sb1.append("Sachin IS A BatsMan");
	System.out.println(sb1.capacity());
	System.out.println("He Lives In Mumbai");
	System.out.println(sb1.capacity());
	System.out.println("=======================");
	
	StringBuilder strb = new StringBuilder();
	System.out.println(strb.capacity());
	strb.append("Saurav IS A BatsMan");
	System.out.println(strb.capacity());
	System.out.println("He Lives In Mumbai");
	System.out.println(strb.capacity());
}
}
