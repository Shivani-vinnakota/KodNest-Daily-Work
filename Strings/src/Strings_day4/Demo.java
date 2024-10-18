package Strings_day4;

public class Demo{
	public static void main(String[] args) {
		String s1 = "Saurav";
		String s2 = "Sachin";
		
		if(s1.compareTo(s2)>0) {
			System.out.println("String 1 is Greater than String 2");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("String 2 is Greater than String 1");
		}
		else {
			System.out.println("Strings Are Equal");
		}
	}
}
