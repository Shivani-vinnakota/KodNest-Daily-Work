import java.util.Scanner;
public class Switch {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the operator: + or - or * or /");
		char opt = scan.next().charAt(0);
		switch(opt) {
		case '+':
			System.out.println("Addition Operator");
		case '-':
			System.out.println("Subtraction Operator");
		case '*':
			System.out.println("Multiplication Operator");
		case '/':
			System.out.println("Division Operator");
		default :
			System.out.println("idiot read the message properly ");
				
			
		}
	}

}
