import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class HibernateLazyEager {
	private static final SessionFactory concreteSessionFactory;
	    static {
	        try {
	            concreteSessionFactory = new AnnotationConfiguration()
	                    .configure().buildSessionFactory();
	        } catch (Throwable ex) {
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	    public static Session getSession()
	            throws HibernateException {
	        return concreteSessionFactory.openSession();
	    }
	    
	    public static void main(String... args){
	    	Session session=getSession();
	    	session.beginTransaction();
	    	State s1= new State(1,1,"AP");
	    	State s2= new State(2,1,"Telangana");
	    	Set<State> states= new HashSet<State>();
	    	states.add(s1);
	    	states.add(s2);
	    	Country country= new Country(1,"India",states);
	    	session.persist(country);
	    	session.getTransaction().commit();
	    	session.close();
	    	//start new session to check fetch type
	        session=getSession();
	    	session.beginTransaction();
	    	Country con= (Country)session.get(Country.class,new Integer(1));
			//access collection
	    	System.out.println(con.getStates().size());
	        session.clear();
	    }
	}
 