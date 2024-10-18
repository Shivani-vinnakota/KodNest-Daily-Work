import java.util.Scanner;
public class CalculatorApp {
	public static void main(String[]args) {
		
		Scanner scan= new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("Hello user Welcome To Kodnest...........");
		
		
		while(true) {
		System.out.println("+ =========> Addition");
		System.out.println("- =========> Subtraction");
		System.out.println("* =========> Multiplication");
		System.out.println("/ =========> Division");
		System.out.println("% =========> FindRemainder");
		System.out.println("^ =========> FindSquare");
		System.out.println("! =========> To Stop");
		System.out.println("Enter your Choice:");
		char ch = scan.next().charAt(0);
		
		switch(ch) {
		case '+' : calculator.addition();
		           break;
		case '-' : calculator.subtraction();
                   break;
		case '*' : calculator.multiplication();
                   break;
		case '/' : calculator.division();
                    break;
		case '%' : calculator.findRemainder();
                    break;
		case '^' : calculator.findSquare();
                    break;
		case '!' :System.out.println("Ta taa Bye Byee See Youuuuuuuuuuu");
		            return;
		default : System.out.println("Please read the message properly");
		}
		scan.close();
	}

  }
}
