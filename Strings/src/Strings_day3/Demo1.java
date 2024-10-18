package Strings_day3;

public class Demo1 {
public static void main(String[] args) {
	String name = new String("Raja Ram Mohan Roy");
	System.out.println(name);
	
	System.out.println(name.toUpperCase());
	System.out.println("===================");
	System.out.println(name.toLowerCase());
	System.out.println("===================");
	System.out.println(name.charAt(3));
	System.out.println("===================");
	System.out.println(name.indexOf('j'));
	System.out.println("===================");
	System.out.println(name.contains("Ram"));
	System.out.println("===================");
	System.out.println(name.contains("Aam"));
	System.out.println("===================");
	System.out.println(name.substring(9));
	System.out.println("===================");
	System.out.println(name.substring(9,14));
	System.out.println("===================");
}
}
