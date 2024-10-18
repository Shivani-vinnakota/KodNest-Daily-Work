package com.kodnest.MultiLevelInheritance;

public class CarApp {
public static void main(String[] args) {
	Sedan s = new Sedan();
	s.regNo = 1234;
	s.move();
	
	Car c = new Car();
	c.regNo = 5467;
	c.move();
	
	Vehicle v = new Vehicle();
	v.regNo=7834;
	v.move();
}
}
