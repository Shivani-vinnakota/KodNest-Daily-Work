package com.kodnest.Constructorchaining1;

public class Driver extends Human{
String skill;
String gender;
public Driver() {
	super("Sharath",30,6.0f);
}
public Driver(String skill) {
	this();
	this.skill=skill;
}
public Driver(String skill, String gender) {
this("Driving without gear car");
	this.skill = skill;
	this.gender = gender;
}
}
