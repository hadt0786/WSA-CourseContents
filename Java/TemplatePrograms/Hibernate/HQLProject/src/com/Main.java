package com;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hql.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		// Hibernate query language code............
		// FROM CLAUSE
		
		String hql = "FROM UserDetails";
		Query query = session.createQuery(hql);
		List results = query.list();
		
		System.out.println(results.size());
		
		// Where clause
		
		String hql2 = "FROM UserDetails where id>5";
		Query query2 = session.createQuery(hql2);
		List results2 = query2.list();
		
		System.out.println(results2.size());
		
		//SELECT Clause
		System.out.println("select.........................");
		String hql1 = "SELECT u.name FROM UserDetails u";
		//String hql4 = "SELECT max(id) FROM UserDetails";
		
		//Query query1 = session.createQuery(hql1);
		Query query1 = session.createQuery(hql1);
		
		
		//Pagination
		
		System.out.println("pagination..........................");
		String hql3 = "FROM UserDetails";
		
		Query query3 = session.createQuery(hql3);
		query3.setFirstResult(5);//start point 
		query3.setMaxResults(4);//end point
		
		
		
		List<UserDetails> results3 = (List<UserDetails>)query3.list();
		
		for(UserDetails ud : results3){
			
			System.out.println(ud.getName());
		}
			
	//Binding parameter and SQL injection/parameter substitution
		
		System.out.println("Binding Parameter...................");
		
		String uid = "5"; 
		String uname="sehong";
		
		
		//Query query5 = session.createQuery("FROM UserDetails where id> ? and name = ?");
		Query query5 = session.createQuery("FROM UserDetails where id> :id and name = :name");
		//query5.setInteger(0, Integer.parseInt(uid));
		//query5.setString(1, uname);
		
		query5.setInteger("id", Integer.parseInt(uid));
		query5.setString("name", uname);
		
		List <UserDetails>results5 = (List<UserDetails>)query5.list();
		
		for(UserDetails u: results5){
			
			System.out.println(u.getName());
			
		}
		
		session.flush();
		session.close();
		
		
		
		
		
		

	}

}
