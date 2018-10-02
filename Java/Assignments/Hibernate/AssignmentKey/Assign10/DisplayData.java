import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
import java.util.*;  
public class DisplayData
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
      
		//creating transaction object  
		Transaction t=session.beginTransaction();  
          
		Query qry = session.createQuery("select c.id from  Emertxe c");
    		 
    	List l =qry.list();
    	System.out.println("Total Number Of Records : "+l.size());
    	Iterator it = l.iterator();
    	while(it.hasNext())
    	{
    	  Integer i = (Integer)it.next();
    	  System.out.println(" id : "+i.intValue());
    	  System.out.println("---------------------------");
    		 
    	}        
    		 
 
    		//session.persist(e1);//persisting the object  

    		t.commit();//transaction is committed  
    		session.close();  
   
    
      
	}  
}  