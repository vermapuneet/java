package com.springcore.splexression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+5}")
	private int x;
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int d;
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	@Value("#{new java.lang.String('dsdf')}")
	private String name;
	@Value("#{8>3}")
	private boolean isActive;

	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", d=" + d + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	public String getName() {
		return name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	
}
