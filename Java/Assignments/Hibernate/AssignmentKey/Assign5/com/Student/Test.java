package com.Student;
import org.hibernate.*;  
import org.hibernate.cfg.*;  
  
public class Test
 {  
	public static void main(String[] args)
	 {  
    	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();  
      
    	Transaction t=session.beginTransaction();  
      
    	StudDetails s1=new StudDetails();  
  		s1.setId(129);  
  		s1.setName("lee");
		StudDetails s2=new StudDetails();  
  		s2.setId(128);  
  		s2.setName("Jiin");
            
   		session.persist(s1);  
    	session.persist(s2);  
      
    	t.commit();  
  		session.close();  
   		System.out.println("successfully saved");  
	 }  
}  