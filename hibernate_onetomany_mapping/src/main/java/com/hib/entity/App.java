package com.hib.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        
        List <Product> list1 = new ArrayList<Product>();
        list1.add(p1);
        list1.add(p2);
        
        List <Product> list2 = new ArrayList<Product>();
        list2.add(p3);
        list2.add(p4);
       
        Customer c1 = new Customer(1, "Amit", 22, list1);
		Customer c2 = new Customer(2, "Ankit", 24, list2);

		p1.setProductId(111);
		p1.setProdName("Keyboard");
		p1.setCost(1000);
		p1.setCustomer(c1);

		p2.setProductId(222);
		p2.setProdName("Mouse");
		p2.setCost(700);
		p2.setCustomer(c1);

		p3.setProductId(333);
		p3.setProdName("TV");
		p3.setCost(150000);
		p3.setCustomer(c2);

		p4.setProductId(444);
		p4.setProdName("Camera");
		p4.setCost(125000);
		p4.setCustomer(c2);

        Configuration cfg = new Configuration();
        cfg.configure(); // cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();  
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        session.save(c1);
		session.save(c2);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		txn.commit();

		System.out.println("----------> Done");


        
    }
}
