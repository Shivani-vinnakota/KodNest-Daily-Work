package com.kodnest.encapsulation;

public class ClassRoom {
	int temp;
	public void setTemperature(int x) {
		if( x > 10 && x < 35) {
			temp = x;
		}
		else {
			System.out.println("Invalid temperature");
		}
	}
	public int getTemperature() {
		return temp;
	}

}
