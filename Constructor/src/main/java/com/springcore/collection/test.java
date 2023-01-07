package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
			Employee obj=(Employee)context.getBean("r");
			System.out.println(obj);
		System.out.println(obj.getName());
		System.out.println(obj.getPhones());
		System.out.println(obj.getAddresses());
		System.out.println(obj.getCourses());
		System.out.println(obj.getPhones().getClass().getName());
	}

}
