package com.hib.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
public static void main(String[] args) 
{ 
	App app = new App();
	app.read();
	
	
	public void read() {
		Configuration conf = new Configuration().configure();
        SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        Laptop laptop = session.get(Laptop.class,111);
        txn.commit();
        System.out.println("Laptop fetched from database -" +laptop);
	}
	
	public void create() {
		Laptop laptop = new Laptop(111,"Dell",56789);
		Configuration conf = new Configuration().configure();
        SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        session.save(laptop);
        txn.commit();
        System.out.println("Laptop has been created -"+laptop);
	}
	
}
}
