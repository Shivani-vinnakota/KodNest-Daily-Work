package staticvariable;

import java.util.Scanner;

public class BusinessMan {
	String name;
	int p;
	int t;
	static float r;
	float si;
	static {
		r=2.0f;
	}

	public void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter P for BusinessMan "+name);
		 p = scan.nextInt();
		System.out.println("Enter T for BusinessMan "+name);
		 t = scan.nextInt();
			
	}
	public void calculateSi() 
	{
	  si=(p*t*r)/100;
	}
	public void display() {
		System.out.println("SI is "+ si);
	}
	public BusinessMan(String name) {
		this.name = name;
	}
	
}
