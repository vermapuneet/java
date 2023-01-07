package com.puneet.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/puneet/Constructor/config.xml");
        Student o=(Student)context.getBean("r");
        System.out.println(o);
    }
}
