import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class CreateTable 
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
          
		Create c1=new Create();  
		c1.setId(4);  
		c1.setName("lee"); 
		c1.setCity("Bangalore");
		session.persist(c1);
		t.commit();//transaction is committed  
		session.close();  
      
		System.out.println("successfully saved"); 
    
      
	}  
}  