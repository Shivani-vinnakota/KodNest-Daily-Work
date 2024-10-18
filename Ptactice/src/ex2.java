import java.util.Scanner;
public class ex2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String s[]= new String[10];
	System.out.println("Enter the Employee first names ");
	for(int i=0;i<=s.length-1;i++) {
		s[i]=scan.next();
	}
	System.out.println("Employee first names are");
	for(int i=0;i<=s.length-1;i++) {
		System.out.println(s[i]+" ");
	}
	scan.close();
}
}
