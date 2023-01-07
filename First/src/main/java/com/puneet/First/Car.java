package com.puneet.First;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car  implements Vechile
{	@Autowired
	private Tyre t;


	

	public void drive()
	{
		System.out.println("car is moving" +" "+ t.m());
	}
}
