package com.kodnest.Constructorchaining1;

public class HumanDriverApp {
public static void main(String[] args) {
	Driver theDriver = new Driver("Driving with gear car", "Female");
	System.out.println(theDriver.name+" "+theDriver.age+" "+theDriver.height+" "
	+theDriver.skill+" "+theDriver.gender);
	
}
}
