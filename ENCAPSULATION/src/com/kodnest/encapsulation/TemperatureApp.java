package com.kodnest.encapsulation;

public class TemperatureApp {
public static void main(String[] args) {
	ClassRoom cr = new ClassRoom();
	cr.setTemperature(-28);
	System.out.println(cr.getTemperature());
}
}
