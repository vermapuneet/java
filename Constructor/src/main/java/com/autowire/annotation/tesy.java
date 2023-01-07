package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tesy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/autowire/annotation/autoconfig.xml");
		Employee obj=(Employee)context.getBean("emp");
		System.out.println(obj.getAdddress());
		

	}

}
