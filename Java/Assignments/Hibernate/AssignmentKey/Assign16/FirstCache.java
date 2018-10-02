import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class FirstCache
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
		Emertxe e1=(Emertxe) session.load(Emertxe.class, 1);
		System.out.println("name1 ="+e1.getEmpName()); 
		
		
		//creating second session object  
		Session session2=factory.openSession();  
      		
		//creating second transaction object  
		Transaction t2=session2.beginTransaction();  
		Emertxe e2=(Emertxe) session.load(Emertxe.class, 1);
		System.out.println("name2 ="+e2.getEmpName()); 
		
		session.persist(e1);//persisting the object  
		t.commit();//transaction1 is committed  
		session.close();  

		t2.commit();//transaction2 is committed  
		session2.close();
	}  
}  
