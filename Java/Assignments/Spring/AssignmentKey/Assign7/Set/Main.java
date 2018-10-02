import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String arg[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Report r = (Report) ac.getBean("r");
		
		Set s = r.getSet();
		System.out.println(s);
	
	}
}
