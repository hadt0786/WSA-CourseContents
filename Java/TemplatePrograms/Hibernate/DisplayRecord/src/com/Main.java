package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		
		Employee e = (Employee)s.load(Employee.class,new Integer(4));
		
		
	
		
		s.delete(e);
		s.flush();
		t.commit();
		s.close();

	}

}
