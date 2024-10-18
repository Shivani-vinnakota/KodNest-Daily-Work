package com.hib.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

 public static void main(String[] args) {
	 
	  Bike b1 = new Bike(111,"KTM",9876);
	  Bike b2 = new Bike(222,"YAMAHA",239876);
	  Bike b3 = new Bike(333,"Royal Enfield",9999876);
	  
	  Student s1 = new Student(1, "Ajay", 34,b2);
	  Student s2 = new Student(2, "Amith", 34,b3);
	  Student s3 = new Student(3, "Ankith", 34,b1);
  
  //1. Configure the hibernate.cfg.xml file
  Configuration cfg = new Configuration();
  cfg.configure(); // cfg.configure("hibernate.cfg.xml");

  //2. Build SessionFactory using configuration
  SessionFactory factory = cfg.buildSessionFactory();
  //3. Open Session using SessionFactory
  Session session = factory.openSession();
  //4. Begin Transaction using session
  Transaction txn = session.beginTransaction();

  session.save(s1);
  session.save(s2);
  session.save(s3);
  session.save(b1);
  session.save(b2);
  session.save(b3);
  
  //5. Commit the Transaction
  txn.commit();
  System.out.println("---->Done!"); 

 }
}
