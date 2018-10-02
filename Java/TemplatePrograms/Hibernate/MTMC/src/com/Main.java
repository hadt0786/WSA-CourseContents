package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		
		cfg.configure("mtmc.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		// the pojo class object creation
		
		Employee emp = new Employee();
		Student s = new Student();
		Teacher t = new Teacher();
		
		
		//inserting the data ion the pojo class
		// setting  the data in the employee pojo class
		
		
		emp.setId(1);
		emp.setName("vikash");
		emp.setDepartment("java");
		
		//setting the data in student pojo class
		
		s.setId(1);
		s.setName("Hakson");
		s.setAge(25);
		
		//setting the data in teacher pojo class
		
		t.setId(1);
		t.setName("Likhitha");
		t.setSubject("Java");
		
		
		/* inserting the data in the database for employee, 
		student and teacher*/
	
		
		session.save(emp);
		session.save(s);
		session.save(t);
		
	
		tx.commit();
		session.flush();
		session.close();
		

	}

}
