package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext fac = new ClassPathXmlApplicationContext("beans.xml");

		Report r = (Report)fac.getBean("rep");
		
		List <Customer> list = r.getCustomerList();
		
		System.out.println(list);
	}

}
