package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/sterotype/sterpconfig.xml");
		Student obj=(Student)context.getBean("target");
		System.out.println(obj.getAddress());
		System.out.println(obj.hashCode());
		Student obj1=(Student)context.getBean("target");
		System.out.println(obj1.hashCode());
			
	}

}
