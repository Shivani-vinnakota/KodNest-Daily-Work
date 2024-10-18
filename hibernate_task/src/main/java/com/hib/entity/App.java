package com.hib.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

 public static void main(String[] args) {
  Student s1 = new Student(1, "Shivani", 99);
  Student s2 = new Student(2, "Shivaay", 19);
  Student s3 = new Student(3, "Shiv", 59);
  
  Bike b1 = new Bike(1,"DUKE",203000.23);
  Bike b2 = new Bike(2,"KTM",123000.23);
  Bike b3 = new Bike(3,"YAMAHA",243000.23);
  
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
