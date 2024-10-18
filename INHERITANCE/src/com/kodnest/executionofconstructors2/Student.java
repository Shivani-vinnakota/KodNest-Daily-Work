package com.kodnest.executionofconstructors2;

public class Student {
String name;
int age;
public Student(String name, int age) {
	this.name = name;
	this.age=30;
}
public Student(String name) {
	this.name=name;
	age=21;
}
public Student() {
	super();
}
}
