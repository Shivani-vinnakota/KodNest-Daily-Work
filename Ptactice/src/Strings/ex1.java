package Strings;
import java.util.Scanner;
public class ex1 {
public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string to reverse");
	String str = scan.nextLine();
	char[] arr1= str.toCharArray();
	char[]arr2 = new char[str.length()];
	
	int j = arr2.length-1;
	for(int i = 0 ;i<=arr1.length-1;i++) {
		arr2[j]=arr1[i];
		j--;
	}
	str = new String(arr2);
	System.out.println(str);
}
}
