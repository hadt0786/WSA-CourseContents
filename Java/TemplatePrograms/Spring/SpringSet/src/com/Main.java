package com;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext fac = new ClassPathXmlApplicationContext("beans.xml");
		
		Report r= (Report)fac.getBean("rep");
		
		Set<Object> set = r.getStudentSet();
		
		System.out.println(set);
		

	}

}
 