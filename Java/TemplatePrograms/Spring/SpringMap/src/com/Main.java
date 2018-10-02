package com;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext fac = new ClassPathXmlApplicationContext("beans.xml");

		//request to the ioc container for the bean class
		
		Report r = (Report)fac.getBean("rep");
		
		
		
		Map<Integer, Employee> map = r.getEmployeeDetails();
		
		System.out.println(map);
		
		
	}

}
