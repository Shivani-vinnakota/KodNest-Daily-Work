package com.hib.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Technology t1 = new Technology();
    	Technology t2 = new Technology();
    	Technology t3 = new Technology();
    	Technology t4 = new Technology();
    	
    	List<Technology> technologies1 = new ArrayList<Technology>();
    	technologies1.add(t1);
    	technologies1.add(t3);
    	technologies1.add(t4);

    	List<Technology> technologies2 = new ArrayList<Technology>();
    	technologies2.add(t2);
    	technologies2.add(t3);

    	List<Technology> technologies3 = new ArrayList<Technology>();
    	technologies3.add(t1);
    	technologies3.add(t2);
    	technologies3.add(t3);

    	List<Technology> technologies4 = new ArrayList<Technology>();
    	technologies4.add(t3);
    	technologies4.add(t4);

    	List<Technology> technologies5 = new ArrayList<Technology>();
    	technologies5.add(t1);
    	technologies5.add(t2);
    	technologies5.add(t3);
    	technologies5.add(t4);
    	
    	Employee e1 = new Employee(1,"Amith","B",technologies1);
    	Employee e2 = new Employee(2,"Ankith","A",technologies2);
    	Employee e3 = new Employee(3,"Aakash","C",technologies3);
    	Employee e4 = new Employee(4,"Ankur","A",technologies4);
    	Employee e5 = new Employee(5,"Anjali","B",technologies5);
    	
    	List<Employee> employees1 = new ArrayList<Employee>();
    	employees1.add(e1);
    	employees1.add(e3);
    	employees1.add(e5);

    	List<Employee> employees2 = new ArrayList<Employee>();
    	employees2.add(e2);
    	employees2.add(e3);
    	employees2.add(e5);

    	List<Employee> employees3 = new ArrayList<Employee>();
    	employees3.add(e1);
    	employees3.add(e2);
    	employees3.add(e3);
    	employees3.add(e4);
    	employees3.add(e5);

    	List<Employee> employees4 = new ArrayList<Employee>();
    	employees4.add(e1);
    	employees4.add(e4);
    	employees4.add(e5);
    	
    	t1.setTechId(111);
    	t1.setTechName("Java");
    	t1.setEmployees(employees1);
    	
    	t2.setTechId(222);
    	t2.setTechName("Python");
    	t2.setEmployees(employees2);
    	
    	t3.setTechId(333);
    	t3.setTechName("MYSQL");
    	t3.setEmployees(employees3);
    	
    	t4.setTechId(444);
    	t4.setTechName("React");
    	t4.setEmployees(employees4);
    	
    	Configuration cfg = new Configuration();
        cfg.configure(); // cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();  
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		txn.commit();

		System.out.println("----------> Done");

		
    	
    }
    
}
