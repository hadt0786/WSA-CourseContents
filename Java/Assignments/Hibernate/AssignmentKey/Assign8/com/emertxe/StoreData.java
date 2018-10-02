package com.emertxe;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.AnnotationConfiguration;  
   	public class StoreData 
         	{  
	    public static void main(String[] args)
 	   {  
	        //creating configuration object  
	    	AnnotationConfiguration cfg=new AnnotationConfiguration();  
	        Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
	          
    		Transaction t=session.beginTransaction();
      
    		StudentAnn s1=new StudentAnn();  
   
    		s1.setName("likhitha");      
    		
    		Regular_Student_Ann s2=new Regular_Student_Ann();  
    		s2.setName("anjani");     
    		s2.setFee(50000);  
    		s2.setDiscount(5000);       
    		
    		Weekend_Student_Ann s3=new Weekend_Student_Ann(); 
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