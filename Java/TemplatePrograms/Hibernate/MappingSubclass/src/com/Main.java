package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args){
		
		
		
		Configuration cfg = new Configuration();
		
		cfg.configure("msub.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		
		// creating the instance of employee class
		
		Employee emp = new Employee();
		
		emp.setId(1);
		emp.setName("JIIN");
		emp.setCo_name("Emertxe");
		//emp.setType(type);
		
		//creating the instance for Trainer class
		
		Trainer t = new Trainer();
		t.setId(2);
		t.setName("vikash");
		t.setCo_name("emertxe");
		//t.setType(type);
		
		//creating the instance for Manager class
		
		Manager m = new Manager();
		m.setId(3);
		m.setName("Jayakumar");
		m.setCo_name("emertxe");
		//m.setType(type);

		
		
		s.save(emp);
		s.save(t);
		s.save(m);
		
		tx.commit();
		s.flush();
		s.close();
		
		
		
	}
}
