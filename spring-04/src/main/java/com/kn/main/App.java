package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.bean.University;
import com.kn.bean.Trainer;

public class App {
	public static void main(String[] args) {
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		  
		  University university = (University) context.getBean("university");
		  System.out.println(university);
		  
		  Trainer trainer = (Trainer)context.getBean("trainer1");
		  System.out.println(trainer);
}
}
