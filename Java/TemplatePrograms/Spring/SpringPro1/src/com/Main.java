package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Account acc = new Account();// huge coupling or huge dependency
		//acc.withdraw();
		
		BeanFactory fac = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		
		Account acc =(Account)fac.getBean("accObj");
		acc.withdraw();

		Transaction t = (Transaction)fac.getBean("tran");
		t.transact();
	}

}
