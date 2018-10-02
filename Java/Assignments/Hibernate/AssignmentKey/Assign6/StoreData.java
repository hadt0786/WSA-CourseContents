import org.hibernate.Query;
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
      
		//creating transaction object  
		Transaction t=session.beginTransaction();  
          
		Emertxe e1=new Emertxe();  
		// e1.setId(54);  
		e1.setEmpName("lee"); 
		//session.persist(e1);//persisting the object  

		Emertxe e2=new Emertxe();  
		// e2.setId(55);  
		e2.setEmpName("sunae"); 
		//session.persist(e2);//persisting the object  

		t.commit();//transaction is committed  
		session.close();  
      
		System.out.println("successfully saved"); 
    
      
	}  
}  