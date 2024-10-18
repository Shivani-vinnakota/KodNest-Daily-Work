package day_3;
import java.util.Scanner;
public class ChId {
	public static void identifyCharacter(char ch)
	{
	// your code here
		if(ch == 'A'||ch == 'E'||ch =='I'||ch == 'O'||ch == 'U') {
			System.out.println("It is uppercase vowel");
		}
		else if(ch == 'a'||ch == 'e'||ch =='i'||ch == '0'||ch == 'u') {
			System.out.println("It is uppercase vowel");
		  }
		else if(ch=='B'|| ch=='C'|| ch=='D'|| ch=='F'||ch=='G'|| ch=='H'||ch=='J'|| ch=='K'||ch=='L'|| ch=='M'
				|| ch=='N'|| ch=='P'|| ch=='Q'||ch=='R'|| ch=='S'||ch=='T'|| ch=='V'||ch=='W'|| ch=='X'
				|| ch=='Y'||ch=='Z'){
			
			System.out.println("It is uppercase Consonant");
		}
		else {
			System.out.println("It is lowercase Consonant");
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = scan.next().charAt(0);
	      identifyCharacter(ch);
		
	}
}
