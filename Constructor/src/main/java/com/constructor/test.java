package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String args[])
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/constructor/config.xml");
		Person obj=(Person)context.getBean("r");

			System.out.println(obj);
			
			Addition obj1=(Addition)context.getBean("d");
			obj1.sum();
			
	}

	}
