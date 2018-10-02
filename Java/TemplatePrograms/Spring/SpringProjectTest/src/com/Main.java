package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Main {

	public static void main(String[] args) {
		
		BeanFactory fac = null;
		fac=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		// getting the object of bean class Account
		Account a= (Account)fac.getBean("accObj");
		
		a.withdraw();
		
		
		//getting the object of bean class Transaction
		
		Transaction t = (Transaction)fac.getBean("tran");
		t.transact();

	}

}
