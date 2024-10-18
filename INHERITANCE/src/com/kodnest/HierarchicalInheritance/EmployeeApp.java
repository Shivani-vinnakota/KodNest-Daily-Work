package com.kodnest.HierarchicalInheritance;

public class EmployeeApp {
public static void main(String[] args) {
	Manager m = new Manager();
	m.name="shivani";
	m.salary=12500;
	System.out.println(m.name+ " "+m.salary);
	m.work();
	
	Employee e = new Employee();
	e.name ="sharath";
	e.salary=10000;
	System.out.println(e.name+" "+e.salary);
	e.work();
	
	Developer d = new Developer();
	d.name ="Maisha";
	d.salary=15000;
	System.out.println(d.name+" "+d.salary);
	d.work();
	
	TestEngineer t = new TestEngineer();
	t.name ="sharath";
	t.salary=20000;
	System.out.println(t.name+" "+t.salary);
	t.work();
	
	TeamLead tl = new TeamLead();
	tl.name="santhosh";
	tl.salary=7800;
	System.out.println(tl.name+" "+tl.salary);
	tl.work();
	
}
}
