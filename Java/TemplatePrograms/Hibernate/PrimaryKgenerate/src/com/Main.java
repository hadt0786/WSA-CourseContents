package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("primarykg.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s= sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		//creating the instance of pojo class
		Student s1 = new Student();
		
		s1.setName("vikash");
		
		s.save(s1);
		tx.commit();
		s.flush();
		s.close();
		
		
		
		
		
		
		
		

	}

}
