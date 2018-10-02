package com.emertxe;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
	
		 BeanFactory beanfactory = new ClassPathXmlApplicationContext("beans.xml");
		 Student bean = (Student) beanfactory.getBean("st");
		          

	 bean.display();
	
	}

}
