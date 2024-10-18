import java.util.Scanner;
public class PersonApp {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  id");
		int id = scan.nextInt();
		System.out.println("Enter Name");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("Enter Gender");
		String gender = scan.next();
		System.out.println("Enter Email");
		String email = scan.next();
		System.out.println("Enter Phone no");
		long phoneno = scan.nextLong();
		
		Person p = new Person(id,name,gender,email,phoneno);
		System.out.println(p.id+" "+p.name+" "+p.gender+" "+p.email+" "+p.phoneno);
				
	}

}
