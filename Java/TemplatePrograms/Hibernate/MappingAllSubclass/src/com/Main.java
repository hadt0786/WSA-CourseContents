package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("mallsub.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx = s.beginTransaction();
		
		//Creating the instance of Student POJO class
		
		Student std1 = new Student();
		std1.setId(1);
		std1.setName("Vikash");
		
		Student std2 = new Student();
		std2.setId(3);
		std2.setName("Jiin");
		
		
		
		
		StudentAddress sa1 =new StudentAddress();
		
		
	
		
		sa1.setId(1);
		sa1.setName("Vikash");
		sa1.setAddress("New Delhi");
		
		
		
		
		
		
		//s.sa(std1);
		//s.save(sa1);
		

		s.update(sa1);
		tx.commit();
		s.flush();
		s.close();
		
		
		

	}

}
