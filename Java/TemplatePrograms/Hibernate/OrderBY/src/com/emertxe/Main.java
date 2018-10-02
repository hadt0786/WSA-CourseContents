package com.emertxe;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hql.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session= sf.openSession();
	
		Query query = session.createQuery("from UserDetails where id>5 group by name ");
		//Query query = session.createQuery("from UserDetails where id>5 order by name asc ");
		
		
		List<UserDetails> list = query.list();
		
		for(UserDetails u : list){
			
			
			System.out.print(u.getId()+" ");
			System.out.println(u.getName());
			
			
		}
		
		

	}

}
