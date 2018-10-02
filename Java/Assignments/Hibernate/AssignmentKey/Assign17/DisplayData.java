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
		String uid="1";
		String uname="likhitha";
          
		Query qry = session.createQuery(" from  Emertxe where id> :id and empName= :empName");
		qry.setInteger("id",Integer.parseInt(uid));
		qry.setString("empName", uname);
    		 
    		List<Emertxe> l =(List<Emertxe>)qry.list();
    	
    		t.commit();//transaction is committed  
    		session.close();  
    		for(Emertxe e:l)
    			System.out.println(e.getEmpName());
   
    
      
	}  
}  
