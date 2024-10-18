package com.kodnest.Constructorchaining2;

public class Son extends Father {
public Son() {
	super("Rajaram","123345","54321");
}
public void display() {
	System.out.println(name+" "+accno+" "+password);
}
}
