package com.constructor;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("constructor of double and doubel");
	}
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor of a and b");
	}
	
	public void sum()
	{
		System.out.println("sum"+(this.a+this.b));
	}
	
}
