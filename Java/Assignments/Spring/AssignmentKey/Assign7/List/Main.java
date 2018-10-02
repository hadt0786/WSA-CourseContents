import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String arg[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Report r = (Report) ac.getBean("rt");
		
		List<Customer> l = r.getList();
		
		System.out.println(l);
		
	}
}
