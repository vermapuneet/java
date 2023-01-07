package com.springcore.annotationonly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("first")
public class Student {
	@Autowired
	private Samosa so;
	
	public Student(Samosa so) {
		super();
		this.so = so;
	}

	public Samosa getSo() {
		return so;
	}

	public void setSo(Samosa so) {
		this.so = so;
	}

	public void study()
	{	this.so.display();
		System.out.println("student is studing");
	}

}
