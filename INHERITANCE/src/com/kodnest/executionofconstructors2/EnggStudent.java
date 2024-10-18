package com.kodnest.executionofconstructors2;

public class EnggStudent extends Student {
int marks;
int sem;
public EnggStudent(String name) {
	this.name= name;
}
public EnggStudent(String name, int age) {
	this.name= name;
	this.age= age;
}
public EnggStudent(String name, int age,int marks,int sem) {
	this.name= name;
	this.age= age;
	this.marks = marks;
	this.sem = sem;
}
}
