import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String arg[]){
		ApplicationContext fac = new ClassPathXmlApplicationContext("beans.xml");
		
		Manager m = (Manager) fac.getBean("Manager");
		Employee em = (Employee) fac.getBean("Employee");
		
		m.managerDetalis();
	}
}
