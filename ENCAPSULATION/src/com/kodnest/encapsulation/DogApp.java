package com.kodnest.encapsulation;

public class DogApp {
public static void main(String[] args) {
	Dog dog = new Dog("Rocky", "Black",5,"Retriver");
	System.out.println(dog.getName()+" "+dog.getColor()+" "+dog.getAge()+" "+dog.getBreed());
}
}
