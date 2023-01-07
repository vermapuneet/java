package com.constructor;

public class Person {
	private String name;
	private int id;
	private Cert n; 
	public Person(String name, int id,Cert namew) {
		super();
		this.name = name;
		this.id = id;
		n=namew;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "cetificate"+this.n+"]";
	}
	
	
}
