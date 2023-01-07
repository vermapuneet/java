package com.springcore.annotationonly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context=
					new AnnotationConfigApplicationContext(config.class);
			Student s=context.getBean("first",Student.class);
			s.study();
	}

}
