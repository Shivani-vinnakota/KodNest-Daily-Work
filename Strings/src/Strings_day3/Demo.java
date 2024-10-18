package Strings_day3;

public class Demo {
public static void main(String[] args) {
	String s1 = new String("Shruthi");
	String s2 = new String("SHRUTHI");
	
	if(s1==s2) {
		System.out.println("References comp====> Equal to Operator");
		System.out.println("References Are Equal");
	}
	else {
		System.out.println("References comp====> Equal to Operator");
		System.out.println("References Are UnEqual");
	}
	System.out.println("===============================");
   if(s1.equals(s2)) {
	   System.out.println("String comparsion==> equals()");
	   System.out.println("Strings Are Equal");
   }
   else {
	   System.out.println("String comparsion==> equals()");
	   System.out.println("strings Are Unequal");
   }
   System.out.println("===============================");
   if(s1.equalsIgnoreCase(s2)) {
	   System.out.println("String comparsion==> equalsIgnoreCase()");
	   System.out.println("strings Are Equal");
   }
   else {
	   System.out.println("String comparsion==> equalsIgnoreCase()");
	   System.out.println("strings Are Unequal");  
   }
   
}
}
