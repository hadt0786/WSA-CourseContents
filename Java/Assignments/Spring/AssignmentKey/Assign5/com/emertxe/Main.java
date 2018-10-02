package com.emertxe;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BeanFactory beanfactory = new ClassPathXmlApplicationContext("beans.xml");
		 Employee bean = (Employee) beanfactory.getBean("empl");
		          

	 bean.employeeDetail();
	}

}
