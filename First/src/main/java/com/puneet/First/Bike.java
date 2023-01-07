package com.puneet.First;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechile
{
	public void drive()
	{
		System.out.println("Bike is moving");
	}
}
