package com.puneet.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory=new AnnotationConfigApplicationContext(com.puneet.SpringAnno.Appconfig.class);
		Samsung o=factory.getBean(Samsung.class);
		o.config();
    }
}
