package com.emertxe;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
   	public class StoreData 
         	{  
	    public static void main(String[] args)
 	   {  
	        //creating configuration object  
	        Configuration cfg=new Configuration();  
	        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	          
	        //creating session factory object  
	        SessionFactory factory=cfg.buildSessionFactory();  
	          
	        //creating session object  
	        Session session=factory.openSession(); 
    		Transaction t=session.beginTransaction();
      
    		Student s1=new Student();  
   
    		s1.setName("likhitha");      
    		
    		Regular_Student s2=new Regular_Student();  
    		s2.setName("anjani");     
    		s2.setFee(50000);  
    		s2.setDiscount(5000);       
    		
    		Weekend_Student s3=new Weekend_Student(); 
    		s3.setName("Praveena");     
    		s3.setNo_of_days(50);  
    		s3.setFee_per_day(1000);  
      
    		session.persist(s1);  
    		session.persist(s2);  
    		session.persist(s3);  
      
   		 		t.commit();  
   		 		session.close();  
   		 		System.out.println("success");  
	    }  
          }