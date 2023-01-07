package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String areg[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standalonecollectionconfig.xml");
	
		Person m=context.getBean("person2",Person.class);
		System.out.println(m);
		
	}
}
