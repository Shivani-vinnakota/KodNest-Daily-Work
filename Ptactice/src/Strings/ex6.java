package Strings;

import java.util.Scanner;

public class ex6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	char [] arr = str.toCharArray();
	char [] arr2 = new char[str.length()];
	 
	for(int i =  0; i<= arr.length-1;i++) {
		if(arr[i]==' ') {
			arr2[i]=arr[i];
		}
	}
	
	int j = arr2.length-1;
	for(int i = 0 ; i<= arr2.length-1;i++) {
		if(arr[i]!=' ') {
			if(arr2[j]==' ')
				j--;
			
			arr2[j]=arr[i];
			j--;
		}
	}
	
	str = new String(arr2);
	System.out.println(str);
	
}
}
