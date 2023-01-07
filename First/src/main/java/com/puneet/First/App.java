package com.puneet.First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/puneet/First/spring.xml");
        //Vechile o=(Vechile)context.getBean("bike");
        //o.drive();  
        Car o=(Car)context.getBean("car");
        o.drive();
    }	
}
