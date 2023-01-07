package com.springcore.annotationonly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcore.annotationonly")
public class config {
	/*
	 * public Samosa gets() { return new Samosa(); }
	 * 
	 * @Bean(name= {"h1","h2"}) public Student getStudentObject() { return new
	 * Student(gets()); }
	 */

}
