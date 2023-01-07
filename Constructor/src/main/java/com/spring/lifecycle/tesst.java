package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tesst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
//		Samosa obj=(Samosa)context.getBean("s1");
//		System.out.println(obj);
//		//to call shudown mehod
		context.registerShutdownHook();
//		
//		System.out.println("-----------------------------");
//		Pepsi obj1=(Pepsi)context.getBean("p1");
//		System.out.println(obj1);
		Example o=(Example)context.getBean("example");
		System.out.println(o);
		
	}
}
