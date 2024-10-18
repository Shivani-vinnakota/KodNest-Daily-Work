import java.util.Scanner;
public class Main 
{
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the input :");
	int in= scan.nextInt();
	EmployeeManager em = new EmployeeManager(5);
	if(in==1)
	{
		System.out.println("Enter the Employee Name:");
		String name = scan.next();
		System.out.println("Enter the Employee Salary:");
		double sal = scan.nextDouble();
		em.addEmployee(name, sal);
	}
	else if(in==2)
	{
		em.displayEmployee();
	}
	else if(in==3)
	{
		em.allEmployeeDetails();
	}
	else
	{
		System.out.println("Invalid Input");
	}
}
}
