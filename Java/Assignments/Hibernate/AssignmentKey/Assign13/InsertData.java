import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertData 
{
	public static void main(String args[])
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
      t.begin();
	Update u1= new Update();
	u1.setId(3);
	u1.setName("hak");
	u1.setDepartment("Korea");

	session.saveOrUpdate(u1);
	t.commit();
	session.close();
}
}
