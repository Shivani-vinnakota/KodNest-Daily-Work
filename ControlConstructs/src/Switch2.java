import java.util.Scanner;
public class Switch2 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number from 1 to 7 to print the day");
		int d  = scan.nextInt();
		switch(d) {
		case 1:{
			System.out.println("Super Sunday");
			break;
		}
		case 2:{
			System.out.println("Login Monday");
			break;
		}
		case 3:{
			System.out.println("Techy Tuesday");
			break;
		}
		case 4:{
			System.out.println("tired Wednesday");
			break;
		}
		case 5:{
			System.out.println("1 more day to go Thursday");
			break;
		}
		case 6:{
			System.out.println("Logout Friday");
			break;
		}
		case 7:{
			System.out.println("outing Saturday");
			break;
		}
		default :
			System.out.println("Waste fellow !!! read the message properly ");
		}
	}
}
