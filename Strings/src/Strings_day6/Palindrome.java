package Strings_day6;

public class Palindrome {
public boolean isPalindrome(String str) {
	char arr1[] = str.toCharArray();
	char arr2[]=new char[arr1.length];
	int j = arr2.length-1;
	for(int i = 0;i<= arr1.length-1;i++) {
		arr2[j]=arr1[i];
		j--;
	}
	
	String str2 = new String(arr2);
	System.out.println("String after reversing====>"+str2);
	if(str.equalsIgnoreCase(str2))
		return true;
	else
		return false;
}
}
