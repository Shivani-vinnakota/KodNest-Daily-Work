package com.kodnest.inheritance;

public class RoboApp {
public static void main(String[] args) {
	TeacherRobo tr = new TeacherRobo();
	ChefRobo cr = new ChefRobo();
	DriverRobo dr = new DriverRobo();
	
	tr.name="Chitti";
	tr.type="Humanoid";
	tr.talk();
	tr.walk();
	tr.charge();
	tr.teach();
	System.out.println("========================================================");
	cr.name="Amy Jackson";
	cr.type="HumanFenoid";
	cr.talk();
	cr.walk();
	cr.charge();
	cr.cook();
	System.out.println("========================================================");
	dr.name="Will Smith";
	dr.type="AndroBranoid";
	dr.talk();
	dr.walk();
	dr.charge();
	dr.drive();
	
}
}
