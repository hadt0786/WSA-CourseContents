import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String arg[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Report r = (Report) ac.getBean("r");
		
		Map<Integer, Employee> map = r.getMap();
		
		System.out.println(map);
	}
}
