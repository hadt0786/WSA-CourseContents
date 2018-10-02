package com;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		
		//First Level Cache implementation are by default
		
		
		UserDetails ud = (UserDetails)session.get(UserDetails.class, new Integer(1));
		
		
		session.flush();
		session.close();
		
		
		

	}

}
